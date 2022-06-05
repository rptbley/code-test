function solution(answers) {
    var answer = [];

    const personOne = compareArrays([1, 2, 3, 4, 5], answers);
    const personTwo = compareArrays([2, 1, 2, 3, 2, 4, 2, 5], answers);
    const personThree = compareArrays([3, 3, 1, 1, 2, 2, 4, 4, 5, 5], answers);

    const personArr = [personOne, personTwo, personThree]

    const maxNum = Math.max.apply(null, personArr);

    personArr.forEach((person, index)=> {
        if(maxNum === person) answer.push(index + 1);
    })


    return answer;
}

function compareArrays(sheet, answers) {
    const resultArr = [];
    const sheetLength = sheet.length;
    const answerLength = answers.length

    const dividedNumber = answerLength / sheetLength;
    const restNumber = answerLength % sheetLength > 0 ? 1 : 0;
    const rangeNumber = dividedNumber + restNumber;

    for(let i = 0; i < rangeNumber; i++) {
        const dividedSheet = answers.slice(i * sheetLength, (i + 1) * sheetLength);
        if(dividedSheet.length > 0) resultArr.push(dividedSheet)
    }

    let result = 0;
    for(let i = 0; i < resultArr.length; i++) {
        for(let j = 0; j < resultArr[i].length; j++) {
            if(resultArr[i][j] === sheet[j]) {
                result++;
            }
        }
    }

    return result;
}

console.log(solution([1,2,3,4,5]))