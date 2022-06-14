class StrangeString {
    public String solution(String s) {
        String[] wordList = s.split(" ");
        for(int i =0; i < wordList.length; i++) {
            String target = wordList[i];

            for(int j = 0; j < target.length(); j++) {
                char targetChr = target.charAt(j);
                target = target.replace(targetChr, j % 2 == 0 ? Character.toUpperCase(targetChr) : Character.toLowerCase(targetChr));
            }
            wordList[i] = target;
        }
        return String.join(" ", wordList);
    }

    // 아직 못 품

    public static void main(String[] args) {
        StrangeString strangeString = new StrangeString();
        String result = strangeString.solution("try hello world");
        System.out.println("result = " + result);
    }
}
