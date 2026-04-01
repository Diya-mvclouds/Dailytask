function multiply(n) {
    let output = "";
    for (let i = 1; i <= 10; i++) {
        output += `${n} x ${i} = ${n * i}<br>`;
    }
    return output;
}