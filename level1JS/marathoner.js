function solution(participant, completion) {
    participant.sort();
    completion.sort();

    return participant.find((el, index) => el !== completion[index]);
}

console.log(solution(
    ["marina", "josipa", "nikola", "vinko", "filipa"],
    ["josipa", "filipa", "marina", "nikola"]
))