const prompt = require("prompt-sync")();
let n = Number(prompt("Enter a number: "));
for (let i = 1; i <= n; i++){
    let row = "";
    for (j = n - i; j > 0; j--){
        row += " ";
    }
    for (k = 1; k <= (2*i-1); k++) {
        if((i == n && k % 2 != 0) || k == 1 || k == (2*i-1)){
            row += "*";
        }
        else{
            row += " ";
        }
    }
    console.log(row);
}