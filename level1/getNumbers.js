function solution(s){
    const numArr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    numArr.map((value, index) => s = s.replace(numArr[index], index))
    var answer = Number(s);
    return answer;
}

console.log(solution("one4seveneight"))