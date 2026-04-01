function transform(str) {
    let a = "";
    for (let char of str) {
        let ch = char.charCodeAt(0);
        if (ch % 2 == 0) {
            a += char.toUpperCase();
        } else {
            a += char.toLowerCase();
        }
    }
    return a;
}