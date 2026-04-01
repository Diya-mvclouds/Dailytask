function removeElement(n,r){
    let arr = n.split(" ");
    arr = arr.filter(i => i != r);
    return "After remove element: " + arr;
}