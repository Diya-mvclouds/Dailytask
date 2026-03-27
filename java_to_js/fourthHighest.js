const prompt = require("prompt-sync")();
let arr = prompt("Enter a numbers: ");
let a = arr.split(" ");
let lowest = Infinity;
let secondlowest = Infinity;
for(let i of a){
    if(i < lowest){
        secondlowest = lowest;
        lowest = i;
    }
    else if(i < secondlowest && i != lowest){
        secondlowest = i;
    }
}
console.log(secondlowest)