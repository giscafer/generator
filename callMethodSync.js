var java = require("java");
java.classpath.push('./');
console.log(java.classpath)
var Test = java.import('Test');
var instance = java.newInstanceSync("Test");
var tool = java.newInstanceSync("Tool");
console.log(tool.getFieldNameSync(instance))
console.log(tool.getClassNameSync(instance))

// var result = java.callMethodSync("Test", "doSomething", 42, "test");

// java.callMethodSync(instance, "doSomething", 42, "test", function(err, results) {
//   if(err) { console.error(err); return; }
//   // results from doSomething
// });