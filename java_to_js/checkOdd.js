function checkOdd(num){
    let n = num.split(" ");
    let odd = true;
    for(let i of n){
        if(i % 2 == 0){
            odd = false;
        }
    }
    if(odd){
        return "It contains only odd numbers";
    }
    else{
        return "It contains even numbers";
    }
}