function compareArray(n1,n2){
    let arr1 = n1.split(" ");
    let arr2 = n2.split(" ");
    let x = "";
    for(let i = 0; i < arr2.length; i++){
        let diff = false;
        for(let j = 0; j < arr1.length; j++){
            if(arr1[j] == arr2[i]){
                diff = true
            }
        }
        if(!diff){
            x += arr2[i] + " "; 
        }
    }

    let y = "";
    for(let i = 0; i < arr1.length; i++){
        let diff = false;
        for(let j = 0; j < arr2.length; j++){
            if(arr1[i] == arr2[j]){
                diff = true;
            }
        }
        if(!diff){
            y += arr1[i] + " ";
        }
    }
    return "Elements not in array 1: " + x + "<br>Elements not in array 2: " + y;
}