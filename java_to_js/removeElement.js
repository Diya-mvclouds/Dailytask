const prompt = require("prompt-sync")();
let n = prompt("Enter an elements to array: ");
let arr = n.split(" ");
let r = prompt("Enter a number to remove: ");
arr = arr.filter(i => i != r);
console.log(arr)