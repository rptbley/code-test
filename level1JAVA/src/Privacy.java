import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Privacy {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        LocalDate todayDate = LocalDate.parse(today.replaceAll("\\.", "-"));

        HashMap<String, Integer> termMap = new HashMap<>();
        for(String term : terms) {
            String[] tempArr = term.split(" ");
            termMap.put(tempArr[0], Integer.parseInt(tempArr[1]));
        }

        for(int i = 0; i < privacies.length; i++) {
            String[] tempArr = privacies[i].split(" ");
            LocalDate targetDate = LocalDate.parse(tempArr[0].replaceAll("\\.", "-")).plusMonths(termMap.get(tempArr[1]));

            if(todayDate.isBefore(targetDate)) continue;
            answer.add(i + 1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] solution = new Privacy().solution(today, terms, privacies);

        for(int s : solution) {
            System.out.print(s + ", ");
        }
    }
}
