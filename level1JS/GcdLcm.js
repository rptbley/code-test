function solution(n, m) {
    let divider = 1;

    for(let i = 1; i <= Math.min(n, m); i++) {
        if(n % i === 0 && m % i === 0) divider = i;
    }
    const multiple = (n / divider) * (m / divider) * divider;
    const answer = [divider, multiple];
    return answer;
}

console.log(solution(1, 1));