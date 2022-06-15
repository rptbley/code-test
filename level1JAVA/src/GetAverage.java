import java.util.Arrays;

class GetAverage {
    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    public static void main(String[] args) {
        GetAverage getAverage = new GetAverage();
        double result = getAverage.solution(new int[]{1,2,3,4});
        System.out.println("result = " + result);
    }
}
