function solution(x) {
    return x % (x.toString().split("").reduce((acc, cur) => acc + Number(cur), 0)) === 0;
}

console.log(solution(11))