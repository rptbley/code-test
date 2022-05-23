function solution(dartResult) {
    const rounds = [...dartResult.matchAll(/(?<score>[0-9]+)(?<SDT>[SDT])(?<option>[*#]?)/g)];
    const result = [];
    let index = 0;
    for(const round of rounds) {
        let score = Number(round.groups.score);
        switch(round.groups.SDT) {
            case "S": score = score ** 1; break;
            case "D": score = score ** 2; break;
            case "T": score = score ** 3; break;
        }

        switch(round.groups.option) {
            case "*":
                if(result.length >= 1) {
                    result[index - 1] = result[index - 1] * 2;
                }
                score *= 2;
                break;
            case "#": score *= -1; break;
            default: break;
        }
        result.push(score)
        index++;
    }

    return result.reduce((acc, cur) => acc + cur);
}

console.log(solution("1D#2S*3S"))