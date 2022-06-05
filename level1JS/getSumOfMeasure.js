function solution(left, right) {
    const answer = [];
    for(let i = left; i <= right; i++) {
        let count = 0;
        for(let j = 1; j <= right; j++) {
            if(i % j === 0) count++;
        }
        count % 2 === 0 ? answer.push(i) : answer.push(i * -1);
    }
    return answer.reduce((acc, cur) => acc + cur);
}

console.log(solution(24, 27))