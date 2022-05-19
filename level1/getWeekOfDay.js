function solution(a, b) {
    return "SUN_MON_TUE_WED_THU_FRI_SAT".split("_")[new Date(`2016-${a}-${b}`).getDay()];
}

console.log(solution(5, 24));