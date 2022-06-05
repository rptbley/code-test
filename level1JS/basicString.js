function solution(s) {
    return s.replace(/[0-9]/g, "").split("").length === 0
        ? s.length === 4 || s.length === 6
        : false;
}

console.log(solution("a234"))