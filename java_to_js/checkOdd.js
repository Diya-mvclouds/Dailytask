const prompt = require("prompt-sync")();
let num = prompt("Enter a numbers: ");
let n = num.split(" ");
console.log(n);
let odd = true;

for(let i of n){
    if(i % 2 == 0){
        odd = false;
    }
}
if(odd){
    console.log("It contains only odd numbers");
}
else{
    console.log("It contains even numbers")
}