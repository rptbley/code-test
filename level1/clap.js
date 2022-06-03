function solution(n) {
    return Array.from({length: n}, (v, i) => i + 1).map(i => i % 2 === 0 ? "박" : "수").join("");
}

console.log(solution(4));