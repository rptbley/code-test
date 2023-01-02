class SeparateString {
    public int solution(String s) {
        int answer = 0;
        String target = s.substring(0, 1);

        int sameCount = 0;
        int diffCount = 0;

        for(int i = 0; i < s.length(); i++) {
            String nextTarget = s.substring(i, i + 1);

            if(target.equals(nextTarget)) {
                sameCount++;
            } else {
                diffCount++;
            }

            if(sameCount == diffCount) {
                answer++;
                sameCount = 0;
                diffCount = 0;
                if(i !=  s.length() - 1) target = s.substring(i + 1, i + 2);
            } else {
                if(i == s.length() - 1) {
                    answer++;
                }
            }


        }
        return answer;
    }

    public static void main(String[] args) {
        SeparateString separateString = new SeparateString();
        int result = separateString.solution("abracadabra");
        System.out.println(result);
    }
}
