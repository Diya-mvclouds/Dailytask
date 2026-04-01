function fourthHighest(arr){
    let a = arr.split(" ");
    let lowest = Infinity;
    let secondlowest = Infinity;
    for(let i of a){
        if(i < lowest){
            secondlowest = lowest;
            lowest = i;
        }
        else if(i < secondlowest && i != lowest){
            secondlowest = i;
        }
    }
    return "Fourth Highest number from 5 elements: " + secondlowest;
}