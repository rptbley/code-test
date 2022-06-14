class StrangeString {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        String[] strList = s.split("");
        for(int i = 0; i < strList.length; i++) {
            String target = strList[i];
            if(target.equals(" ")) {
                index = 0;
                answer.append(" ");
                continue;
            }

            answer.append(index % 2 == 0 ? target.toUpperCase() : target.toLowerCase());
            index++;
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        StrangeString strangeString = new StrangeString();
        String result = strangeString.solution("try hello world");
        System.out.println("result = " + result);
    }
}
