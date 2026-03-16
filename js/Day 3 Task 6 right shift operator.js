const prompt = require("prompt-sync")();
let num = prompt("Enter your number: ");
let shift = prompt("Enter shift number: ")
console.log(Math.floor(num / Math.pow(2, shift)));