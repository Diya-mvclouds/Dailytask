const prompt = require("prompt-sync")();
let num = prompt("Enter a numbers: ");
let n = num.split(' ').map(Number);
console.log(`${Math.max(...n)} ${Math.min(...n)}`);