class SumOfTwoNum {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfTwoNum sumOfTwoNum = new SumOfTwoNum();
        long result = sumOfTwoNum.solution(3, 5);
        System.out.println("result = " + result);
    }
}
