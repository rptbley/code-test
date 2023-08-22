import java.util.HashMap;

public class PaintingOver {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        HashMap<Integer, Boolean> resultMap = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            resultMap.put(i, false);
        }

        for(int i = 0; i < section.length; i++) {
            int targetSection = section[i];
            if(targetSection + m > n) {
                answer++;
                break;
            }

            if(!resultMap.get(targetSection)) {
                for(int j = targetSection; j < targetSection + m; j++) {
                    resultMap.put(j, true);
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int[] section = {1, 3};
        int solution = new PaintingOver().solution(n, m, section);
        System.out.println("solution = " + solution);
    }
}
