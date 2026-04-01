function capital(str) {
    let upper = "", lower = "";
    for (let ch of str) {
        ch == ch.toUpperCase() ? upper += ch : lower += ch;
    }
    return upper + lower;
}