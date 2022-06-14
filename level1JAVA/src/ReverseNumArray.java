import java.util.Arrays;

class ReverseNumArray {
    public int[] solution(long n) {
        String[] targetArr = String.valueOf(n).split("");
        int[] answer = new int[targetArr.length];
        int index = 0;
        for(int i = targetArr.length - 1; i >= 0; i--) {
            answer[index] = Integer.parseInt(targetArr[i]);
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseNumArray s = new ReverseNumArray();
        int[] result = s.solution(12345);
        System.out.println("result = " + Arrays.toString(result));
    }
}
