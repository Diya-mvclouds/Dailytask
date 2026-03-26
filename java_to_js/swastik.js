const prompt = require("prompt-sync")();
let n = prompt("Enter an odd number: ");
let mid = Math.floor(n/2);
for(let i = 0; i < n; i++){
    let row = "";
    for(let j = 0; j < n; j++){
        if(i == mid || j == mid ||
           i == 0 && j > mid ||
           j == 0 && i < mid ||
           i == n - 1 && j < mid ||
           j == n - 1 && i > mid
        ){
            row += "* ";
        }
        else{
            row += "  "
        }
    }
    console.log(row)
}