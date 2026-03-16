const prompt = require('prompt-sync')();
let num = prompt("Enter a numbers with space-seperate:");
let nums = num.split(" ");
console.log(nums);
a=[];
sum = 0;
for (const i of nums){
    if(!a.includes(i)){
        a.push(i);
        sum += Number(i);
    }
}
console.log("After removing duplicates: ",a);
console.log("Sum of unique numbers: ",sum);