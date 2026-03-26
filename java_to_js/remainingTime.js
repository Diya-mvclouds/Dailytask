const prompt = require('prompt-sync')();
const end = new Date(prompt("Enter End Date (YYYY-MM-DD): "));

setInterval(() => {
    let diff = end - new Date();
    if (diff <= 0) {
        console.clear();
        console.log("Time reached!");
        return;
    }

    let y = Math.floor(diff / (1000 * 60 * 60 * 24 * 365));
    let m = Math.floor((diff / (1000 * 60 * 60 * 24 * 30)) % 12);
    let d = Math.floor((diff / (1000 * 60 * 60 * 24)) % 31);
    let h = Math.floor((diff / (1000 * 60 * 60)) % 24);
    let min = Math.floor((diff / (1000 * 60)) % 60);
    let s = Math.floor((diff / 1000) % 60);

    console.clear();
    console.log(`Remaining: ${y}y ${m}m ${d}d ${h}h ${min}m ${s}s`);  
}, 1000);
