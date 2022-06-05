function solution(num) {
    let answer = 0;
    let target = num;
    for(let i = 0; i < 500; i++) {
        if(target === 1) {
            answer = i;
            break;
        }

        target = target % 2 === 0 ? target / 2 : target * 3 + 1;
    }
    return target !== 1 ? -1 : answer;
}

console.log(solution((16)));