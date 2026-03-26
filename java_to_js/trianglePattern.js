let n = 6;
for (let i = 1; i < n; i++) {
    let row = "";
    for (let j = 0; j < 2 * (n - i); j++) {
        row += " ";
    }
    for (let j = 0; j < i; j++) {
        row += "* ";
    }
    console.log(row);
}