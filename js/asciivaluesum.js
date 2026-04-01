function asciiSum(str){
    let arr = str.split("");
    let b = 0;
    for(const char of arr){
        const ch = char.charCodeAt(0);
        let a = Number(String(ch));
        b += a;
    }
    return "Sum of ASCII value: " + b;
}