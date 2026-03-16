const prompt = require("prompt-sync")();
let num = prompt("Enter a numbers: ");
const swapped = Number(num.toString().split('').reverse().join(''));
console.log(num >= swapped);