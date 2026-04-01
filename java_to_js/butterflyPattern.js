function butterfly(n){
    let output = "";
    for (let i = 1; i <= n; i++) {
        let row = "";
        for (let j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                row += "* ";
            } else {
                row += "  ";
            }
        }
        for (let j = 1; j <= 2 * (n - i); j++) {
            row += "  ";
        }
        for (let j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                row += "* ";
            } else {
                row += "  ";
            }
        }
        output += row + "<br>";
    }

    for (let i = n - 1; i >= 1; i--) {
        let row = "";
        for (let j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                row += "* ";
            } else {
                row += "  ";
            }
        }
        for (let j = 1; j <= 2 * (n - i); j++) {
            row += "  ";
        }
        for (let j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                row += "* ";
            } else {
                row += "  ";
            }
        }
        output += row + "<br>";
    }
    return output;
}