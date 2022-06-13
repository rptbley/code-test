import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortString {
    public String solution(String s) {
        String answer = "";
        List<String> smallStr = Arrays.stream(s.replaceAll("[A-Z]", "").split(""))
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> bigStr = Arrays.stream(s.replaceAll("[a-z]", "").split(""))
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        smallStr.addAll(bigStr);
        for(String str : smallStr) {
            answer += str;
        }
        return answer;
    }

    public static void main(String[] args) {
        SortString sortString = new SortString();
        String result = sortString.solution("Zbcdefg");
        System.out.println("result = " + result);
    }
}
