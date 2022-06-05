function solution(phone_number) {
    const targetArr = phone_number.split("");
    const front = Array.from({length: targetArr.length - 4}).fill("*").join("");
    const back = targetArr.slice(targetArr.length - 4, targetArr.length).join("");
    return front + back;
}

console.log(solution("01033334444"))