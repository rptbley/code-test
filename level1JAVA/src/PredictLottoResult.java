class PredictLottoResult {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] ranks = {6, 6, 5, 4, 3, 2, 1};
        int correctCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    correctCount++;
                    break;
                }
            }
        }

        answer[0] = ranks[correctCount + zeroCount];
        answer[1] = ranks[correctCount];
        return answer;
    }
    public static void main(String[] args) {
        PredictLottoResult predictLottoResult = new PredictLottoResult();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = predictLottoResult.solution(lottos, win_nums);

        for(int r : result) {
            System.out.print(r + ", ");
        }
    }
}
