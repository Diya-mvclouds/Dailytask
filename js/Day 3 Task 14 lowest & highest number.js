function minMax(input) {
    let n = input.split(' ').map(Number);
    return ` Maximum: ${Math.max(...n)} <br> Minimum: ${Math.min(...n)}`;
}