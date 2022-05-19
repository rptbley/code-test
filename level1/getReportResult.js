function solution(id_list, report, k) {
    const answer = new Array(id_list.length).fill(0);

    const reduceDupleList = new Set(Array.from(report));

    const userId = [];
    const reportedId = [];
    for(const r of reduceDupleList) {
        const [user, reportedUser] = r.split(" ");
        userId.push(user);
        reportedId.push(reportedUser);

        
    }

    console.log(reduceDupleList)

    return answer;
}

let i = solution(
    ["muzi", "frodo", "apeach", "neo"],
    ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"],
    2);

console.log(i)