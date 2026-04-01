function findWord(sent,word){
    let a = "";
    if(sent.includes(word)){
        a += "Word found..!";
    }
    else{
        a += "Word not found..!!";
    }
    return a;
}