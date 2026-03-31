const prompt = require("prompt-sync")();
let a = prompt("Enter a numbers: ");
let arr = a.split(" ");
console.log(arr);
let r = [];
let odd = [];
let even = [];
let oddsum = 0;
let evensum = 0;
for (let i = arr.length - 1; i >= 0; i--) {
    let a = Number(arr[i]);
    if(a % 2 == 0){
        even += a;
        evensum += a;
    }
    else{
        odd += a;
        oddsum += a;
    }
}
r += odd + even;
let x = r.split(""); 
console.log(x);
console.log(oddsum);
console.log(evensum);
if(oddsum > 10){
    console.log("Output 1")
}
if(evensum > 10){
    console.log("Output 2")
}