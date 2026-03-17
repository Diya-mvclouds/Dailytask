const prompt = require("prompt-sync")();
let str = prompt("Enter a sentence: ");
let a = "";
for (const char of str){
    let ch = char.charCodeAt(0);
    // a += ch % 2 == 0 ? char.toUpperCase() : char.toLowerCase();
    if(ch % 2 == 0){
        a += char.toUpperCase()
    }
    else{
        a+= char.toLowerCase()
    }
}
console.log(a);