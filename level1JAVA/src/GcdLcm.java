import java.util.Arrays;

class GcdLcm {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int gcd = getGCD(max, min);
        int lcm = (max * min) / gcd;
        return new int[]{gcd, lcm};
    }
    // 유클리드 호제법
    public int getGCD(int max, int min) {
        int rest = max % min;
        if(rest == 0) {
            return min;
        }
        return getGCD(min, rest);
    }

    public static void main(String[] args) {
        GcdLcm gcdLcm = new GcdLcm();
        int[] result = gcdLcm.solution(3, 12);
        System.out.println("result = " + Arrays.toString(result));
    }
}
