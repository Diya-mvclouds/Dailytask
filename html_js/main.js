function run() {
    let task = document.getElementById("task").value;
    let input1 = document.getElementById("input1").value;
    let input2 = document.getElementById("input2").value;
    let result = "";

    switch(task) {
        case "1": result = append(input1); break;
        case "2": result = count(input1); break;
        case "3": result = check(input1); break;
        case "4": result = multiply(input1); break;
        case "5": result = swapDigits(input1); break;
        case "6": result = rightShift(input1, input2); break;
        case "7": result = removeZeros(input1); break;
        case "8": result = vowel(input1); break;
        case "9": result = capital(input1); break;
        case "10": result = sortString(input1); break;
        case "11": result = singleDigit(input1); break;
        case "12": result = factors(input1); break;
        case "13": result = transform(input1); break;
        case "14": result = minMax(input1); break;
        case "15": result = asciiSubtract(input1); break;
        case "16": result = asciiSum(input1); break;
        case "17": result = removeDuplicates(input1); break;
        case "18": result = armstrong(input1); break;
        case "19": result = checkOdd(input1); break;
        case "20": result = compareArray(input1, input2); break;
        case "21": result = butterfly(input1); break;
        case "22": result = diamond(input1); break;
        case "23": result = eight(input1); break;
        case "24": result = number(input1); break;
        case "25": result = numberPattern(input1); break;
        case "26": result = rectangle(input1); break;
        case "27": result = star(input1); break;
        case "28": result = swastik(input1); break;
        case "29": result = triangle(input1); break;
        case "30": result = trianglePattern(input1); break;
        case "31": result = fourthHighest(input1); break;
        case "32": result = findElement(input1, input2); break;
        case "33": result = findWord(input1, input2); break;
        case "34": result = permutationCombination(input1, input2); break;
        case "35": result = removeElement(input1,input2); break;
        case "36": result = reverseDecimal(input1); break;
        case "37": result = reverseString(input1); break;
    }
    document.getElementById("output").innerHTML = result;
}