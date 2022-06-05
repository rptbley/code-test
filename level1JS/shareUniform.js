function solution(n, lost, reserve) {
    var answer = n;
    let count = 0;

    let newLost = [];

    lost.forEach(student => {
        if(!reserve.includes(student)) {
            newLost.push(student);
        } else {
            reserve.splice(reserve.indexOf(student), 1);
        }
    })

    newLost.sort((a, b) => a - b);
    reserve.sort((a, b) => a - b);

    console.log(newLost)
    console.log(reserve)

    newLost.forEach(student => {
        const before = student - 1;
        const after = student + 1;

        if(reserve.includes(before)) {
            reserve.splice(reserve.indexOf(before), 1);
        } else if(reserve.includes(after)) {
            reserve.splice(reserve.indexOf(after), 1);
        } else {
            count++;
        }
    })
    return answer - count;
}

console.log(solution(5, [2, 4], [1, 3, 5]))