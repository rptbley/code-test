public class PasswordBetweenThem {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        int max = 'z';

        for(char target : s.toCharArray()) {
            int skipCount = 0;
            for(int i = 0; i < index + skipCount; i++) {
                target += 1;

                if(target > max) target = 'a';

                if(skip.contains(String.valueOf(target))) {
                    skipCount++;
                }
            }

            answer.append(target);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String solution = new PasswordBetweenThem().solution(s, skip, index);
        System.out.println("solution = " + solution);
    }
}
