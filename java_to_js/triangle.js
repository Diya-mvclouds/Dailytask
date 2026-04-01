function triangle(n){
    let output = "";
    for (let i = 1; i <= n; i++){
        let row = "";
        for (let j = n - i; j > 0; j--){
            row += " ";
        }
        for (let k = 1; k <= (2*i-1); k++) {
            if((i == n && k % 2 != 0) || k == 1 || k == (2*i-1)){
                row += "*";
            }
            else{
                row += " ";
            }
        }
        output += row + "<br>";
    }
    return output;
}