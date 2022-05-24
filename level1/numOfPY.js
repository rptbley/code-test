function solution(s) {
    let p = 0;
    let y = 0;
    s.toLowerCase()
        .replace(/[^py]/g, "")
        .split("")
        .forEach(str => {
            str === "p" ? p++ : y++;
        })
    return p === y;
}

console.log(solution("pPoooyY"))