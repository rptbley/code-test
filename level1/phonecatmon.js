function solution(nums) {
    const possiblePickNum = nums.length / 2;
    const delDupleList = new Set(nums);
    return delDupleList.size < possiblePickNum ? delDupleList.size : possiblePickNum;
}

console.log(solution([3, 1, 2, 3]))