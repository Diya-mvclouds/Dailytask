function swapDigits(num) {
    let swap = Number(num.split('').reverse().join(''));
    return "Number is greater than swapped number or not: " + num >= swap;
}