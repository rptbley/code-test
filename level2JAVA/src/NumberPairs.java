public class NumberPairs {
    public long solution(int r1, int r2) {
        long answer = 0;

        long r2xSquared = (long) Math.pow(r2, 2);
        long r1xSquared = (long) Math.pow(r1, 2);

        for(int i = 1; i <= r2; i++) {
            long r2y = (int) Math.floor(Math.sqrt(r2xSquared - Math.pow(i, 2)));
            long r1y = (int) Math.ceil(Math.sqrt(r1xSquared - Math.pow(i, 2)));

            answer += (r2y - r1y + 1);
        }

        return answer * 4;
    }

//    999999, 1000000, 6281440

    // x^2 + y^2 = r^2
    // y^2 = r^2 - x^2

    public static void main(String[] args) {
        int r1 = 999999;
        int r2 = 1000000;
        System.out.println("solution = " + new NumberPairs().solution(r1, r2));
    }
}
