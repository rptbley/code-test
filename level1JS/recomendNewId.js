function solution(new_id) {
    var answer = '';

    answer = new_id.toLowerCase();
    answer = answer.replace(/[^a-z0-9-_.]/g, '');
    let flag = false;

    while(!flag) {
        if(answer.includes("..")) {
            answer = answer.replace("..", ".");
        } else {
            flag = true;
        }
    }

    if(answer[0] === ".") answer = answer.replace(answer[0], "");
    if(answer[answer.length - 1] === ".") answer = answer.replace(answer[answer.length - 1], "");

    if(answer === "") answer = "a";

    if(answer.length >= 16) answer = answer.slice(0, 15);

    if(answer[answer.length - 1] === ".") answer = answer.replace(answer[answer.length - 1], "");

    while(answer.length <= 2) {
        answer = answer + answer[answer.length - 1]
    }

    return answer;
}

console.log(solution("a."))