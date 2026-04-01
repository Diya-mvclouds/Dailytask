function asciiSubtract(str){
    let arr = str.split("");
    let b = 0;
    let c = 128;
    let output = "";
    for(const char of arr){
        const ch = char.charCodeAt(0);
        let a = Number(ch);
        b -= a;
        output += char + " " + a + "<br>";

        if (a < c) {
            c = a;
        }    
    }
    if(b <= 0){
        output += "Smallest ASCII value: " + c + "<br>";
    }
    output += "Subtraction of ASCII values: " + b;
    return output;
}