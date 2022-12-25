function solution(s, n) {
  const answer = [];

  const smallA = 97;
  const smallZ = 122;
  const bigA = 65;
  const bigZ = 90;

  s.split("").forEach((str) => {
    const targetChar = str.charCodeAt(0);
    let changeChar = targetChar + n;
    if (targetChar === 32) return answer.push(str);

    if (bigA <= targetChar && targetChar <= bigZ) {
      if (changeChar > bigZ) {
        changeChar = changeChar - bigZ + bigA - 1;
      }
    }

    if (smallA <= targetChar && targetChar <= smallZ) {
      if (changeChar > smallZ) {
        changeChar = changeChar - smallZ + smallA - 1;
      }
    }
    answer.push(String.fromCharCode(changeChar));
  });
  return answer.join("");
}

console.log(solution("a B z", 4));
