import java.util.Arrays;

class HarshadNumber {
    public boolean solution(int x) {
        int sum = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        return x % sum == 0;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        System.out.println("result = " + harshadNumber.solution(100000));
    }
}
