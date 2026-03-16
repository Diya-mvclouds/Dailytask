const prompt = require("prompt-sync")();
let str = prompt("Enter a string:");
let arr = str.split("");

for(let i= 0; i < arr.length; i++){
    for(let j= i+1; j < arr.length; j++){

        if(arr[i].charCodeAt(0) > arr[j].charCodeAt(0)){
            let temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}

let result = arr.join("");
console.log("Sorted String:", result);