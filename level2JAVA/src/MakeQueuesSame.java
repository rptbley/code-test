class MakeQueuesSame {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        int q1Sum = sumOfQueue(queue1);
        int q2Sum = sumOfQueue(queue2);
        int targetNum = (q1Sum + q2Sum) / 2;

        return answer;
    }

    private int sumOfQueue(int[] queue) {
        int result = 0;

        for (int i = 0; i < queue.length; i++) {
            result += queue[i];
        }

        return result;
    }

    public static void main(String[] args) {
        MakeQueuesSame makeQueuesSame = new MakeQueuesSame();
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};
        int result = makeQueuesSame.solution(queue1, queue2);
        System.out.println("result = " + result);
    }
}
