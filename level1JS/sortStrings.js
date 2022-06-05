function solution(strings, n) {
    let answer = [];

    const targetObj = {};
    const charList = [];
    strings.forEach(str => {
        const char = str[n];

        if(!charList.includes(char)) charList.push(char);

        if(targetObj[char] === undefined) {
            targetObj[char] = [str];
        } else {
            targetObj[char] = [...targetObj[char], str];
        }
    })

    charList
        .sort()
        .forEach(char => {
            targetObj[char].sort().forEach(obj => {
                answer.push(obj);
            })
        })
    return answer;
}

console.log(solution(["abce", "abcd", "cdx"], 2))