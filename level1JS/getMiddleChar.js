function solution(s) {
    return s.substring(s.length / 2 - (s.length % 2 === 0 ? 1 : 0), s.length / 2 + 1)
}

console.log(solution("qwer"))