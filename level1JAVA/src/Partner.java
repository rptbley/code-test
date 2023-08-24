import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Partner {
    public String solution(String X, String Y) {
        List<Integer> partnerList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int xLength = X.length();
            int xCount = xLength - X.replaceAll(String.valueOf(i), "").length();

            int yLength = Y.length();
            int yCount = yLength - Y.replaceAll(String.valueOf(i), "").length();

            for(int j = 0; j < Math.min(xCount, yCount); j++) {
                partnerList.add(i);
            }
        }

        if(partnerList.isEmpty()) return "-1";

        partnerList.sort(Comparator.reverseOrder());
        if(partnerList.get(0) == 0) return "0";

        StringBuilder answer = new StringBuilder();
        for(Integer partner : partnerList) {
            answer.append(partner);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String x = "5525";
        String y = "1255";
        System.out.println("solution = " + new Partner().solution(x, y));
    }
}
