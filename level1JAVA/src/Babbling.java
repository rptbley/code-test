public class Babbling {
    public int solution(String[] babbling) {
        String[] possibleSounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String b : babbling) {
            if(b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) continue;
            for(String sound : possibleSounds) {
                b = b.replaceAll(sound, " ");
            }

            if(b.trim().isEmpty()) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println("solution = " + new Babbling().solution(babbling));
    }
}
