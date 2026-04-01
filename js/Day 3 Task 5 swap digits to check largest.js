function swapDigits(num) {
    let swapped = Number(num.split('').reverse().join(''));
    return num >= swapped;
}
