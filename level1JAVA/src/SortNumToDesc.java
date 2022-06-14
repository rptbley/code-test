import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class SortNumToDesc {
    public long solution(long n) {
        List<String> target = Arrays.asList(String.valueOf(n).split(""));
        target.sort(Comparator.reverseOrder());
        return Long.parseLong(String.join("", target));
    }

    public static void main(String[] args) {
        SortNumToDesc s = new SortNumToDesc();
        long result = s.solution(8000000000L);
        System.out.println("result = " + result);
    }
}
