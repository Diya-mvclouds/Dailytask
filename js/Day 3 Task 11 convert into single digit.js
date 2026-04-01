function singleDigit(input) {
    let numbers = input.split(" ").map(Number);
    let sum = numbers.reduce((total, num) => total + num, 0);
    while (sum >= 10) {
        sum = sum.toString().split("").reduce((product, digit) => product * Number(digit), 1);
    }
    return "Final single digit number: " + sum;
}