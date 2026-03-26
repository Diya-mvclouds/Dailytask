const prompt = require("prompt-sync")();
let n = prompt("Enter a number: ");
let count = 0;
for(let i = 1; i < n; i++){
    let row = "";
    for(let j = 0; j < n - i; j++){
        row += " ";
    }
    for(let j = 0; j < i; j++){
        count = count + 1;
        row += count + " ";
    }
    console.log(row)
}