import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DelDupleNum {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int targetNum = -1;
        for(int num : arr) {
            if(targetNum == num) continue;
            answer.add(num);
            targetNum = num;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        DelDupleNum delDupleNum = new DelDupleNum();
        int[] test = new int[]{1,1,3,3,0,1,1};
        int[] result = delDupleNum.solution(test);
        System.out.println("result = " + Arrays.toString(result));
    }
}
