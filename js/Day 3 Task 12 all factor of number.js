const prompt = require("prompt-sync")();
let n = prompt("Enter a number for factors: ");
const result = [];
for (let i = 1; i <=n; i++){
    if (n % i == 0) result.push(i);
}
console.log(result);