import java.nio.charset.StandardCharsets;

class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int smallA = 'a';
        int smallZ = 'z';
        int bigA = 'A';
        int bigZ = 'Z';

        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                answer.append(arr[i]);
                continue;
            }

            int target = arr[i];
            int converted = target + n;
            if(smallA <= target && target <= smallZ) {
                if(converted - smallZ > 0) {
                    converted = (converted - smallZ) + smallA - 1;
                }
            } else if(bigA <= target && target <= bigZ) {
                if(converted - bigZ > 0) {
                    converted = (converted - bigZ) + bigA - 1;
                }
            }
            answer.append(Character.toString(converted));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String result = caesarCipher.solution("a B z", 4);
        System.out.println("result = " + result);
    }
}
