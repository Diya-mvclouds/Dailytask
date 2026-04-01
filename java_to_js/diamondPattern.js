function diamond(n){
    let output = "";
    for(let i = 0; i <= n; i++){
        let row = "";
        for(let j = 0; j < n - i; j++){
            row += "  ";
        }
        row += "* ";
        for(let j = 1; j <= i; j++){
            row += i + " * ";
        }
        output += row + "<br>";
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
        output += row + "<br>";
    }
    return output;
}