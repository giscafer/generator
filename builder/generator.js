
/**
 * 根据后端pojo类生成前端vo类（typescript)
 */

'use strict'

const fs = require('fs');
const path = require('path');

const OUTPUT_PATH = path.join(__dirname, '/', '../dist/');

/**
 * 创建Vo类
 * @param {Array} fields 字段数组
 * @param {String} fileName 文件名称
 * @param {Function} cb 
 */
function generateVo(fields, fileName, cb) {
    let content = buildVoContent(fields, fileName)
    // console.log(content)
    fs.exists(OUTPUT_PATH, (flag) => {
        if (!flag) {
            console.log('filePath is not exists……\n');
            fs.mkdirSync(OUTPUT_PATH, fs.stats);
        }
        let filePath = OUTPUT_PATH + fileName + '.ts';
        console.log(filePath);
        fs.writeFile(filePath, content, err => {
            if (err) {
                console.error(err);
                process.exit(1);
            } else {
                console.log(fileName + '.ts' + ' vo创建成功：' + filePath);
            }
        });
    });

}

function buildVoContent(fields, fileName) {
    var str = 'export class ' + fileName + ' { \n';
    for (let f of fields) {
        str += '\t' + f + ' :' + ' string;\n';
    }
    str += '}';
    return str;
}


module.exports = {
    generateVo
}