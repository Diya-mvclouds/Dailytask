const prompt = require("prompt-sync")();
let n = prompt("Enter a number: ");
for(let i = 0; i <= n; i++){
    let row = "";
    for(let j = 0; j < n - i; j++){
        row += "  ";
    }
    row += "* "
    for(let j = 1; j <= i; j++){
        row += i + " * ";
    }
    console.log(row)
}
for(let i = n - 1; i >= 0; i--){
    let row = "";
    for(let j = 0; j < n - i; j++){
        row += "  ";
    }
    row += "* ";
    for(let j = 1; j <= i; j++){
        row += i + " * ";
    }
    console.log(row)
}