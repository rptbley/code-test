const getCombinations = function (arr, selectNumber) {
    const results = [];
    if (selectNumber === 1) return arr.map((el) => [el]);


    arr.forEach((fixed, index, origin) => {
        const rest = origin.slice(index + 1);

        const combinations = getCombinations(rest, selectNumber - 1);

        const attached = combinations.map((el) => [fixed, ...el]);

        results.push(...attached);

    });

    return results;
}

const isPrimeNumber = function(num) {
    for(let i = 2; num > i; i++) {
        if(num % i === 0) return false;
    }

    return true;
}

function solution(nums) {
    var answer = 0;

    const addedNumList = [];

    const allNumList = getCombinations(nums, 3);
    console.log(allNumList)
    allNumList.forEach(list => {
        addedNumList.push(list.reduce((acc, v, i) => acc + v));
    })

    addedNumList.forEach(value => {
        if(isPrimeNumber(value)) answer++;
    } )

    return answer;
}

console.log(solution([1,2,3,4]))