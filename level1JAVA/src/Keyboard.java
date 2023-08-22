import java.util.HashMap;

public class Keyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> keyMap = new HashMap<>();

        for (String key : keymap) {
            String[] keyArr = key.split("");

            for(int i = 0; i < keyArr.length; i++) {
                String keyChar = keyArr[i];
                keyMap.put(keyChar, Math.min(i + 1, keyMap.getOrDefault(keyChar, keyArr.length + 1)));
            }
        }

        System.out.println("keyMap = " + keyMap);

        for(int i = 0; i < targets.length; i++) {
            int result = -1;

            String[] strArr = targets[i].split("");

            for(int j = 0; j < strArr.length; j++) {

                Integer searchChar = keyMap.getOrDefault(strArr[j], 0);
                if(searchChar == 0) {
                    result = -1;
                    break;
                }
                result += searchChar;
            }

            if(result > -1) result++;

            answer[i] = result;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"ABCE"};
        String[] targets = {"ABDE"};
        int[] solution = new Keyboard().solution(keymap, targets);

        for(int i : solution) {
            System.out.print(i + ", ");
        }
    }
}
