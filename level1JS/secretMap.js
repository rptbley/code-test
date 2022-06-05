function solution(n, arr1, arr2) {
    let answer = [];

    for(let i = 0; i < n; i++) {
        let resultArr = Array.from({length: n}, (v, i) => 0);

        let target1 = arr1[i].toString(2);
        const length1 = target1.length;
        for(let j = n - length1; j < n; j++) {
            resultArr[j] = target1[j - (n - length1)];
        }

        let target2 = arr2[i].toString(2);
        const length2 =target2.length;
        for(let j = n - length2; j < n; j++) {
            if(resultArr[j] !== "1") {
                resultArr[j] = target2[j - (n - length2)];
            }
        }

        let resultStr = resultArr.join("");
        answer.push(resultStr.replace(/0/g, " ").replace(/1/g, "#"))
    }

    return answer;
}

console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))