const prompt = require("prompt-sync")();
let n1 = prompt("Enter a numbers in array 1: ");
let arr1 = n1.split(" ");
let n2 = prompt("Enter a numbers in array 2: ");
let arr2 = n2.split(" ");
console.log(arr1)
console.log(arr2)
let x = "";
for(let i = 0; i <= arr2.length; i++){
    let diff = false;
    for(let j = 0; j <= arr1.length; j++){
        if(arr1[j] == arr2[i]){
            diff = true
        }
    }
    if(!diff){
        x += arr2[i] + " "; 
    }
}
console.log("Elements not in array 1: ", x)

let y = "";
for(let i = 0; i <= arr1.length; i++){
    let diff = false;
    for(let j = 0; j <= arr2.length; j++){
        if(arr1[i] == arr2[j]){
            diff = true;
        }
    }
    if(!diff){
        y += arr1[i] + " ";
    }
}
console.log("Elements not in array 2: ", y)