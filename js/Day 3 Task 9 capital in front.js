const prompt = require("prompt-sync")();
let str = prompt("Enter a word or characters: ");
let upper = "", lower = "";
for (let ch of str) {
  ch === ch.toUpperCase() ? upper += ch : lower += ch;
}
console.log(upper + lower);