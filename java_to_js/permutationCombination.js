function permutationCombination(n,r){
    function factorial(n){
        let fact = 1;
        for(let i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    per = factorial(n) / factorial(n-r);
    com = factorial(n) / (factorial(r) * factorial(n-r));
    return `Permutation of ${n} & ${r} is ${per} <br>Combination of ${n} & ${r} is ${com}`;
}