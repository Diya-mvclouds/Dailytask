const prompt = require("prompt-sync")();
let num = prompt("Enter a number: ");
let i = num;
let sum = 0;
let count = num.length;
while(num > 0){
    let digit = num % 10;
    sum += Math.pow(digit,count);
    num = Math.floor(num / 10);
}
console.log(sum);
if(sum == i){
    console.log("Armstrong number")
}
else{
    console.log("Not an Armstrong number")
}