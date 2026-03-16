const prompt = require('prompt-sync')();
let str = prompt("Enter a string:");
let arr = str.split("");
console.log(arr);
let b = 0;
for(const char of arr){
    const ch = char.charCodeAt(0);
    let a = Number(String(ch));
    b += a;
}
console.log(b)