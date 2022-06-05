function solution(arr) {
    if(arr.length === 1) {
        return [-1];
    }

    let smallestNum = 0;
    let targetIndex = 0;

    arr.forEach((num, index) => {
        if(index === 0) return smallestNum = num;

        if(smallestNum > num) {
            smallestNum = num;
            targetIndex = index;
        }
    })
    arr.splice(targetIndex, 1);
    return arr;
}

console.log(solution([4,3,2,1]))