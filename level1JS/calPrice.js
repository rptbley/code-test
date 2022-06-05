function solution(price, money, count) {
    console.log(price * count * (count + 1) / 2)
    const temp = price * count * (count + 1) / 2 - money;
    return temp > 0 ? temp : 0;
}

console.log(solution(3, 20, 4))