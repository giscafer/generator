
'use strict'

let java = require("java");
java.classpath.push('./java-class/');
java.classpath.push('./lib/');
let cmd = require('node-cmd');
let generator = require('./builder/generator');
let javaFileReader = require('./builder/java-file-reader');

let fileNames = require('./builder/data.js').split('|');
let javaFilePaths = require('./FilesList');
console.log(javaFilePaths);
let tool = java.newInstanceSync("Tool");

let instances = [];

function g() {
    console.log('开始执行……')
    for (let p of javaFilePaths) {
        p=p.replace(/\/\//g,'/');
        console.log('javac -encoding UTF-8  ' + p)

        cmd.run('javac -encoding UTF-8  ' + p);
    }
    // 
    console.log('Java文件编译完成')
    for (let f of fileNames) {
        let inst = null;
        try {
            inst = java.newInstanceSync(f);
        } catch (e) {
            console.log(f + '报错')
            console.log(e);
        }
        if (inst) {
            instances.push(inst);
            generator.generateVo(tool.getFieldNameSync(inst), f);
        }

    }
}

javaFileReader.read(() => {
    g();
});