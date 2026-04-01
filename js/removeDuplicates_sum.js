function removeDuplicates(num){
    let nums = num.split(" ");
    let a=[];
    let sum = 0;
    for (const i of nums){
        if(!a.includes(i)){
            a.push(i);
            sum += Number(i);
        }
    }
    return "After removing duplicates: " + a + "<br>" + "Sum of unique numbers: " + sum;
}