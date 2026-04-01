function findElement(str, char){
let a = "";
for(let i = 0; i < str.length; i++){
    if(str.charAt(i) == char){
        a += i + " ";
    }
}
return a;
}