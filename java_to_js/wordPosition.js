const prompt = require("prompt-sync")();
let sent = prompt("Write a sentence: ");
let n = prompt("Tell a number to see position: ");
let word = sent.split(" ");
if(n>0 && n<= word.length){
    console.log(word[n-1]);
}
else{
    console.log("Invalid position..!!")
}