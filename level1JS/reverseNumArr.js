function solution(n) {
    return (n + "").split("").reverse().map(num => Number(num));
}

console.log(solution(12345));