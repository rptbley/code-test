class CompareStrings {
    public int solution(String t, String p) {
        int answer = 0;

        int tLength = t.length();
        int pLength = p.length();
        long intP = Long.parseLong(p);

        if(tLength == pLength) {
            return Long.parseLong(t) <= intP ? 1 : 0;
        }

        for(int i = 0; i <= tLength - pLength; i++) {
            long target = Long.parseLong(t.substring(i, i + pLength));
            if(target <= intP) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CompareStrings compareStrings = new CompareStrings();
        int answer = compareStrings.solution("10203", "15");
        System.out.println(answer);
    }
}
