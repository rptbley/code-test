function solution(arr) {
    const answer = [];
    arr.forEach((num, index) => {
        if(arr.length < index + 1) return;
        if(num !== arr[index + 1]) {
            answer.push(num);
        }
    })
    return answer;
}

console.log(solution([1,1,3,3,0,1,1]))