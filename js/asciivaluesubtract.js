const prompt = require('prompt-sync')();
let str = prompt("Enter a string:");
let arr = str.split("");
console.log(arr);
let b = 0;
let c = 128;
for(const char of arr){
    const ch = char.charCodeAt(0);
    let a = Number(ch)
        b -= a;
        console.log(char ,a)
    if (a < c) {
        c = a;
    }    
}
if(b <= 0){
    console.log("Smallest ASCII value:", c);
}
console.log("Subtraction of ASCII values:", b);
