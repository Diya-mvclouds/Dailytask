const prompt = require("prompt-sync")();
let n = prompt("Enter total number: ");
let r = prompt("Enter selected number: ");
function factorial(n){
    let fact = 1;
    for(let i = 1; i <= n; i++){
        fact *= i;
    }
    return fact;
}
per = factorial(n) / factorial(n-r);
com = factorial(n) / (factorial(r) * factorial(n-r));
console.log(`Permutation of ${n} & ${r} is ${per}`);
console.log(`Combination of ${n} & ${r} is ${com}`)