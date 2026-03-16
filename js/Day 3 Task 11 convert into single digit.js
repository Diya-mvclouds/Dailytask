const prompt = require("prompt-sync")();
let input = prompt("Enter two or more numbers separated by space:");
let numbers = input.split(" ").map(Number);
let sum = numbers.reduce((total, num) => total + num, 0);
console.log("Sum:", sum);

while (sum >= 10) {
    sum = sum.toString().split("").reduce((product, digit) => product * Number(digit), 1);
    console.log("Product:", sum);
}

console.log("Final Single Digit:", sum);