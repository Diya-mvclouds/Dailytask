// let arr = [98,32,72,94,75,73,92,36,28,34];
const prompt = require("prompt-sync")();
let a = prompt("Enter a numbers: ");
let arr = a.split(" ");
let highest = 0;
for(let i of arr){
    if(i > highest){
        secondhighest = highest;
        highest = i;
    }
    else if(i > secondhighest && i != highest){
        secondhighest = i;
    }
}
console.log(secondhighest)