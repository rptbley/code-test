function solution(d, budget) {
    d.sort((a, b) => a - b);
    while(d.reduce((acc, cur) => acc + cur, 0) > budget) {
        d.pop();
    }
    return d.length;
}

console.log(solution([1,3,2,5,4], 9))