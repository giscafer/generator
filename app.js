
'use strict'

let java = require("java");
let generator = require('./builder/generator');
let fileNames = require('./java-class/file.json').fileNames;
java.classpath.push('./java-class/');
java.classpath.push('./lib/');
// console.log(java.classpath);
let tool = java.newInstanceSync("Tool");

let instances = [];

function g() {
    for (let f of fileNames) {
        console.log(f)
        let inst = java.newInstanceSync(f);
        instances.push(inst);
        generator.generateVo(tool.getFieldNameSync(inst), tool.getClassNameSync(inst));
    }
}

g();