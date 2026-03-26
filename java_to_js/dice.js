const prompt = require("prompt-sync")();
let dice = prompt("Enter a number of dice: ");
let sum = prompt("Enter target sum: ");
function count(dice, sum){
    if(dice == 0 && sum == 0){
        return 1;
    }
    if(dice == 0 || sum <= 0){
        return 0;
    }
    let ways = 0;
    for(let i = 1; i <= 6; i++){
        ways += count(dice - 1, sum - i);
    }
    return ways;
}
console.log(count(dice,sum))