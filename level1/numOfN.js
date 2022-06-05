function solution(x, n) {
    return Array.from({length: n}, (v, i) => x * (i + 1));
}

console.log(solution(-4, 2));