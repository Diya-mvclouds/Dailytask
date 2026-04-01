function eight(n){
    let width = Math.floor(n/2);
    let output = "";
    for (let i = 0; i < n; i++) {
        let row = " ";
        for (let j = 0; j <= width; j++){
            if ((i == 0 || i == n - 1 || i == Math.floor(n / 2)) && (j > 0 && j < width - 1)) {
                row += "* ";
            } 
            else if ((j == 0 || j == width - 1) && (i != 0 && i != n - 1 && i != Math.floor(n / 2))) {
                row += "* ";
            } 
            else {
                row += "  ";
            }
        }
        output += row + "<br>";
    }
    return output;
}