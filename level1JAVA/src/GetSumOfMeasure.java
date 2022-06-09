class GetSumOfMeasure {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++;
            }
            answer += count % 2 == 0 ? i : i * -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        GetSumOfMeasure getSumOfMeasure = new GetSumOfMeasure();
        int result = getSumOfMeasure.solution(13, 17);
        System.out.println("result = " + result);
    }
}
