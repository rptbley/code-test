class GetPrimeNumbers {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    if(isPrimeNumber(temp)) answer++;
                }
            }
        }
        return answer;
    }

    public boolean isPrimeNumber(int targetNumber) {
        for(int i = 2; i < targetNumber; i++) {
            if(targetNumber % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        GetPrimeNumbers getPrimeNumbers = new GetPrimeNumbers();
        int result = getPrimeNumbers.solution(new int[]{1, 2, 3, 4});
        System.out.println("result = " + result);
    }
}