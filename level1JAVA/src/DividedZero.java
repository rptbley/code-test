import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DividedZero {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) answer.add(arr[i]);
        }
        if(answer.size() == 0) return new int[]{-1};

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        DividedZero dividedZero = new DividedZero();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] result = dividedZero.solution(arr, divisor);
        System.out.println("result = " + Arrays.toString(result));
    }
}
