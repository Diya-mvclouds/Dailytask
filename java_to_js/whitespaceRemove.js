const prompt = require("prompt-sync")();
let str = prompt("Write a sentence: ")
let result = "";
for (let i = 0; i < str.length; i++){
    if (str[i] != ' '){
        result += str[i];
    }
}
console.log("After removing White Space: ", result);