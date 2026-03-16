const prompt = require("prompt-sync")();
let str = prompt("Enter anything: ");
let count = 0;
const vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];
for (const char of str){
    if (vowels.includes(char)){
        count++;
    }
}
console.log(count)