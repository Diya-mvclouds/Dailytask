const prompt = require("prompt-sync")();
let x = Number(prompt("Enter a 1st number: "));
let y = Number(prompt("Enter a 2nd number: "));
x = x + y;
y = x - y;
x = x - y;
console.log("After Swap X value: ", x);
console.log("After Swap Y value: ", y);