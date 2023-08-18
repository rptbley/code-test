import java.util.HashMap;

public class MemoryScore {

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> scoreMap = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++) {
            String[] photoNameArr = photo[i];
            int photoScore = 0;

            for (String photoName : photoNameArr) {
                int score = scoreMap.getOrDefault(photoName, 0);
                photoScore += score;
            }

            answer[i] = photoScore;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] solution = MemoryScore.solution(name, yearning, photo);
        for (int i : solution) {
            System.out.print(i + ",");
        }
    }
}
