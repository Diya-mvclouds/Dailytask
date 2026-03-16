const prompt = require("prompt-sync")();
let str = prompt("Enter a word to check it includes 'ee' or not: ");
console.log(str.includes("ee"));