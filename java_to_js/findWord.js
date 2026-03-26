const prompt = require("prompt-sync")();
let sent = prompt("Write a sentence: ");
let word = prompt("Enter a word: ");
if(sent.includes(word)){
    console.log("Word found..!");
}
else{
    console.log("Word not found..!!")
}