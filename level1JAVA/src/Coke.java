public class Coke {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int leftoverEmptyBottle = 0;

        while(true) {
            if(n + leftoverEmptyBottle < a) {
                break;
            }

            if((n + leftoverEmptyBottle) % a >= 0) {
                n += leftoverEmptyBottle;
            }

            answer += n / a * b;
            leftoverEmptyBottle = n % a;

            n = n / a * b;
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 21;
        System.out.println("solution = " + new Coke().solution(a, b, n));
    }
}
