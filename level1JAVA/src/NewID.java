import java.util.Locale;

class NewID {
    public String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z|0-9|_.-]", "")
                .replaceAll("\\.{2,}", ".")
                .replaceAll("^\\.|\\.$", "");

        if(answer.length() == 0) answer = "a";
        if(answer.length() > 15) answer = answer.substring(0, 15);
        answer = answer.replaceAll("^\\.|\\.$", "");
        if(answer.length() <= 2) {
            String[] answerList = answer.split("");
            String target = answerList[answerList.length - 1];
            for(int i = answerList.length; i < 3; i++) {
                answer += target;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        NewID newID = new NewID();
        String id = "z-+.^.";
        String result = newID.solution(id);
        System.out.println("result = " + result);
    }
}
