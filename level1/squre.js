function solution(sizes) {
    const width = [];
    const height = [];

    for(let i = 0; i < sizes.length; i++) {
        const w = sizes[i][0];
        const h = sizes[i][1];

        if(w > h) {
            width.push(w);
            height.push(h);
        } else {
            width.push(h);
            height.push(w);
        }
    }

    const asc = (a, b) => a - b;
    width.sort(asc);
    height.sort(asc)

    return width[width.length - 1] * height[height.length - 1];
}

console.log(solution([[60, 50], [30, 70], [60, 30], [80, 40]]))
