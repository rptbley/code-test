function solution(lottos, win_nums) {
    var answer = [];

    let fittedNum = 0;
    let numOfZero = 0;
    lottos.map(lotto => {
        if(lotto === 0) {
            numOfZero++;
        } else {
            win_nums.map(num => num === lotto ? fittedNum++ : 0)
        }
    })
    answer = [getResult(fittedNum + numOfZero), getResult(fittedNum)]
    return answer;
}

function getResult(num) {
    switch (num) {
        case 6 : return 1; break;
        case 5 : return 2; break;
        case 4 : return 3; break;
        case 3 : return 4; break;
        case 2 : return 5; break;
        default: return 6; break;
    }
}

let res = solution([44, 1, 0, 0, 31, 25],
    [31, 10, 45, 1, 6, 19]);

console.log(res);