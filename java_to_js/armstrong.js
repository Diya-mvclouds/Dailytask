function armstrong(num){
    let i = num;
    let sum = 0;
    let count = num.length;
    num = Number(num);
    while(num > 0){
        let digit = num % 10;
        sum += Math.pow(digit,count);
        num = Math.floor(num / 10);
    }
    let output = sum + "<br>";
    if(sum == i){
        output += "Armstrong number";
    }
    else{
        output += "Not an Armstrong number";
    }
    return output;
}