const prompt = require("prompt-sync")();
let n = prompt("Enter a decimal number: ");
console.log(n.split('').reverse().join(""))