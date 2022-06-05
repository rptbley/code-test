function solution(n) {
    const targetArr = Array(n + 1).fill(true).fill(false, 0, 2);
    for(let i = 2; i < targetArr.length; i++) {
        for(let j = i * i; j <= n; j += i) {
            targetArr[j] = false;
        }
    }

    return targetArr.filter(target => target).length;
}

console.log(solution(10))