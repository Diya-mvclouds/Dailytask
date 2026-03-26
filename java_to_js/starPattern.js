const prompt = require("prompt-sync")();
let n = prompt("Enter a number: ");
for (let i = 0; i < n; i++) {
    let row = "";
    for (let j = 0; j <= i; j++) {
        if (j == 0 || j == i || i == n - 1) {
            row += "* ";
        } else {
            row += "  ";
        }
    }
    console.log(row);
}
