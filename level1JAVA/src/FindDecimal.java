import java.util.Arrays;

class FindDecimal {
    public int solution(int n) {
        int answer = 0;
        int[] list = new int[n + 1];

        for(int i = 2; i < list.length; i++) {
            list[i] = i;
        }

        for(int i = 2; i < list.length; i++) {
            for(int j = i + i; j <= n; j += i) {
                list[j] = 0;
            }
        }

        for(int i = 2; i < list.length; i++) {
            if(list[i] != 0) {
                System.out.println("i = " + list[i]);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindDecimal findDecimal = new FindDecimal();
        int result = findDecimal.solution(10);
        System.out.println("result = " + result);
    }
}
