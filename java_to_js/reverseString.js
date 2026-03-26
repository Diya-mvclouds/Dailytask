const prompt = require("prompt-sync")();
let str = prompt("write a sentence: ");
let word = str.split(" ");
let result = "";
for(let i = word.length - 1; i >= 0; i--){
    result += word[i] + " ";
}
console.log(result)