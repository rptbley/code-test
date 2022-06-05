function solution(a, b) {
    let answer = 0;
    let startNum = Math.min(a, b);
    let endNum = startNum === a ? b : a;
    for(let i = startNum; i <= endNum; i++) {
        answer += i;
    }
    return answer;
}

console.log(solution(3, 5))