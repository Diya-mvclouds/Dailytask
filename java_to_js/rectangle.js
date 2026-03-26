const prompt = require("prompt-sync")();
let n = prompt("Enter a number: ");
for(let i = 1; i <= n; i++){
    let row = "";
    for(let j = 1; j <= n - i; j++){
        row += " ";
    }
    for(let k = 1; k <= n; k++){
        if (i == 1 || k == 1 || i == n || k == n) {
            row += "*";
        } 
        else {
            row += " ";
        }
    }
    console.log(row);
}