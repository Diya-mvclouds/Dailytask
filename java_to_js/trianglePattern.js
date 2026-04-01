function trianglePattern(n){
    let output = "";
    for (let i = 1; i < n; i++) {
        let row = "";
        for (let j = 0; j < 2 * (n - i); j++) {
            row += " ";
        }
        for (let j = 0; j < i; j++) {
            row += "* ";
        }
        output += row + "<br>";
    }
    return output;
}