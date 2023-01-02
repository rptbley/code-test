import java.util.HashMap;
import java.util.Map;

class MostCloseString {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> stringIndexMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if(i == 0) {
                stringIndexMap.put(target, i);
                answer[i] = -1;
                continue;
            }

            int targetIndex = stringIndexMap.getOrDefault(target, -1);
            answer[i] = targetIndex == -1 ? targetIndex : i - targetIndex;
            stringIndexMap.put(target, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        MostCloseString mostCloseString = new MostCloseString();
        int[] result = mostCloseString.solution("foobar");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
