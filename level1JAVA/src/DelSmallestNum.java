import java.util.Arrays;

class DelSmallestNum {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int[] temp = Arrays.copyOf(arr, arr.length);
        if(arr.length == 1) return new int[]{-1};
        Arrays.sort(temp);
        System.out.println("temp = " + Arrays.toString(temp));
        int smallestNum = temp[0];
        int index = 0;
        for(int num : arr) {
            if(num == smallestNum) continue;
            answer[index] = num;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        DelSmallestNum delSmallestNum = new DelSmallestNum();
        int[] result = delSmallestNum.solution(new int[]{2,5,1,2,3,41});
        System.out.println("result = " + Arrays.toString(result));
    }
}
