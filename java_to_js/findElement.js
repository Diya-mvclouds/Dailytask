const prompt = require("prompt-sync")();
let str = prompt("Enter a string: ");
let char = prompt("Enter a character: ");
let a = "";
for(let i = 0; i < str.length; i++){
    if(str.charAt(i) == char){
        a += i + " ";
    }
}
console.log(a)