function number(n){
    let count = 0;
    let output = "";
    for(let i = 1; i < n; i++){
        let row = "";
        for(let j = 0; j < n - i; j++){
            row += " ";
        }
        for(let j = 0; j < i; j++){
            count = count + 1;
            row += count + " ";
        }
        output += row + "<br>";
    }

    return output;
}