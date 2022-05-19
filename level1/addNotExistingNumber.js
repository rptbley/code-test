function solution(numbers) {
    let target = Array.from({length: 9}, (v, i) => i+1);
    const addNumbersInArray = (sum, currentNumber) => sum + currentNumber;
    return target.reduce(addNumbersInArray) - numbers.reduce(addNumbersInArray);
}

console.log(solution([1,2,3,4,6,7,8,0]))