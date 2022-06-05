function solution(numbers, hand) {
    var answer = '';

    let currentLeftPosition = "*";
    let currentRightPosition = "#";

    const mustLeftPush = [1, 4, 7];
    const mustRightPush = [3, 6, 9];

    const keyPad = {
        1: [0, 0],
        2: [0, 1],
        3: [0, 3],
        4: [1, 0],
        5: [1, 1],
        6: [1, 2],
        7: [2, 0],
        8: [2, 1],
        9: [2, 2],
        "*": [3, 0],
        0: [3, 1],
        "#": [3, 2]
    }

    numbers.forEach(number => {
        if(mustLeftPush.includes(number)) {
            currentLeftPosition = number;
            answer += "L";
            return;
        }

        if(mustRightPush.includes(number)) {
            currentRightPosition = number;
            answer += "R";
            return;
        }

        const [targetX, targetY] = keyPad[number];
        const [leftX, leftY] = keyPad[currentLeftPosition];
        const [rightX, rightY] = keyPad[currentRightPosition];

        const leftLength = Math.abs(targetX - leftX) + Math.abs(targetY - leftY);
        const rightLength = Math.abs(targetX - rightX) + Math.abs(targetY - rightY);

        if(leftLength > rightLength) {
            currentRightPosition = number;
            answer += "R";
            return;
        } else if(leftLength < rightLength) {
            currentLeftPosition = number;
            answer += "L";
            return;
        } else if(leftLength == rightLength) {
            if(hand == "left") {
                currentLeftPosition = number;
                answer += "L";
                return;
            } else {
                currentRightPosition = number;
                answer += "R";
                return;
            }
        }
    })

    return answer;
}

console.log(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right"));