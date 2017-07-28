/**
 * 去除java文件package包，以及非Java类库的import依赖
 */

'use strict'

const fs = require('fs');
const path = require('path');
const glob = require('glob');

const JAVA_PATH = path.join(__dirname, '/', '../java-class/');
const FILE_LIST_PATH = path.join(__dirname, '/', '../FilesList.txt');
const FILE_LIST_JS_PATH = path.join(__dirname, '/', '../FilesList.js');
const DATA_PATH = path.join(__dirname, '/', '../builder/data.js');

let options = {};

function read(cb) {
    glob(JAVA_PATH + "**/*.java", options, function (er, files) {
        let fileNames = [];
        let filePaths = [];
        for (let f of files) {
            let fileName = f.substr(f.lastIndexOf('/') + 1);
            fileNames.push(fileName.replace('.java', ''))
            let file = fs.readFileSync(f, "utf8");
            // console.log(file)
            let si = file.indexOf('package');
            let ei = file.indexOf(';');
            let javacode = file;
            if (si !== -1) {
                javacode = file.substr(ei + 1);
            }
            let result = "";
            try {
                result = replaceObject(javacode)
            } catch (e) {
                // console.log(f);
                throw new Error(e);
            }
            // console.log(result)
            if (result) {
                fs.writeFileSync(JAVA_PATH + fileName, result, { encoding: 'utf8' });
                let path=JAVA_PATH + fileName;
                path=path.replace(/\\/g,'//');
                filePaths.push(path);
            }
        }
        console.log('覆写Java类完成！');
        let fileNameStr = 'module.exports="' + fileNames.join('|') + '"';
        fs.writeFileSync(DATA_PATH, fileNameStr);
        fs.writeFileSync(FILE_LIST_PATH, filePaths.join('|'));
        let filesStr = 'module.exports=["' + filePaths.join('","') + '"]';
        fs.writeFileSync(FILE_LIST_JS_PATH, filesStr);
        cb();
    });
}


function replaceObject(str) {
    // console.log(str)
    let index = str.indexOf('import');
    if (index !== -1) {
        let semicolon = str.indexOf(';', index);
        let importStr = str.substr(index, semicolon);
        let classIndex = importStr.lastIndexOf('.', semicolon);
        let objClass = importStr.substring(classIndex + 1, semicolon);
        let objClassName = objClass.substr(0, objClass.indexOf(';'));
        // console.log(objClassName + '\n');
        let str2 = str.substr(semicolon + 1);
        if (objClassName.length > 2) {
            str2 = str2.replace(new RegExp(objClassName, 'g'), 'Object');
        }
        return replaceObject(str2)
    } else {
        return str
    }

}
module.exports = {
    read
}