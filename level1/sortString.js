function solution(s) {
    return s.split("")
        .map((char, index) => s.charCodeAt(index))
        .sort((a, b) => b - a)
        .map(char => String.fromCharCode(char))
        .join("");
}

console.log(solution("Zbcdefg"))