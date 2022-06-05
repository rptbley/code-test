function solution(s) {
    const answer = [];

    s.split(" ").forEach(str => {
      const changeStr = str.split("").map((char, index) => index % 2 === 0 ? char.toUpperCase() : char.toLowerCase());
      answer.push(changeStr.join(""));
    })
    return answer.join(" ");
}

console.log(solution("try hello world"));