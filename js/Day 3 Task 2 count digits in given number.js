const prompt = require("prompt-sync")();
let num = prompt("Enter a numbers: ");
console.log(Math.abs(num).toString().length);