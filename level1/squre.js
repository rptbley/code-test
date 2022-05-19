function solution(sizes) {
    const width = [];
    const height = [];

    for(let i = 0; i < sizes.length; i++) {
        width.push(sizes[i][0]);
        height.push(sizes[i][1]);
    }

    const asc = (a, b) => a - b;
    width.sort(asc);
    height.sort(asc);


}

console.log(solution([[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]))