function solution(N, stages) {
    var answer = [];

    stages.sort((a, b) => a - b);
    const stageArr = [];
    for(let i = 1; i <= N; i++) {
        let challenger = 0;
        let fail = 0;
        for(let j = 0; j < stages.length; j++) {
            const target = stages[j];
            if(target < i) continue;
            if(target === i) fail++;
            if(target >= i) challenger++;
        }
        stageArr.push([i, fail / challenger]);
    }
    stageArr.sort((a, b) => b[1] - a[1]);
    stageArr.forEach(stage => answer.push(stage[0]))
    return answer;
}

console.log(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]))