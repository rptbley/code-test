class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;
        if(n == 0) return 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i != 0) continue;
            answer += i;
            if(n /i != i) answer += n / i;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        int result = sumOfDivisor.solution(1);
        System.out.println("result = " + result);
    }
}
