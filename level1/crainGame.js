function solution(board, moves) {
    var answer = 0;

    const dollContainer = [];

    moves.forEach(move => {
        for(let i = 0; i < board.length; i++) {
            const target = board[i][move - 1];
            if(target !== 0) {
                board[i][move - 1] = 0;
                if(dollContainer[dollContainer.length - 1] === target) {
                    answer += 2;
                    dollContainer.pop();
                    break;
                } else {
                    dollContainer.push(target);
                    break;
                }
            }
        }
    })
    return answer;
}

console.log("answer => ", solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]], [1,5,3,5,1,2,1,4]))