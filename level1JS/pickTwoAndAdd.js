function solution(numbers) {
    var answer = new Set();
    while(numbers.length >= 2) {
        const target = numbers[0];
        for(let i = 1; i < numbers.length; i++) {
            answer.add(target + numbers[i]);
        }
        numbers.shift();
    }
    return Array.from(answer).sort((a, b) => a - b);
}

console.log(solution([2,1,3,4,1]))