function solution(n) {
    return Number(n.toString().split("").map(num => Number(num)).sort((a, b) => b - a).join(""));
}

console.log(solution(118372));