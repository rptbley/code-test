function solution(absolutes, signs) {
    var answer = 0;
    absolutes.forEach((value, index) => {
        signs[index] ? answer += value : answer -= value;
    })
    return answer;
}

console.log(solution([4,7,12], [true,false,true]))