function solution(n) {
    const result = Math.sqrt(n);
    return Number.isInteger(result) ? (result + 1) ** 2 : -1;
}

console.log(solution(3));