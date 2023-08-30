import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterceptingSystem {
    public int solution(int[][] targets) {
        int answer = 0;

        List<int[]> sortedList = Arrays.stream(targets).sorted(Comparator.comparingInt(prev -> prev[1])).collect(Collectors.toList());

        int end = 0;
        for(int[] target : sortedList) {
            if(end <= target[0]) {
                answer++;
                end = target[1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        System.out.println("solution = " + new InterceptingSystem().solution(targets));
    }
}
