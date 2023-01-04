import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Function;

class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        // 내가 푼 방식
        List<Integer> hallOfFameList = new ArrayList<>();

        Function<Integer, Integer> check = (targetScore) -> {
            hallOfFameList.add(targetScore);

            hallOfFameList.sort(Comparator.reverseOrder());

            if(hallOfFameList.size() < k) {
                return hallOfFameList.get(hallOfFameList.size() - 1);
            }

            return hallOfFameList.get(k - 1);
        };

        for(int i = 0; i < score.length; i++) {
            answer[i] = check.apply(score[i]);
        }


        // Priority Queue ==> 내 코드보다 속도도 훨씬 빠르다...
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            queue.add(score[i]);

            if(queue.size() > k) {
                queue.poll();
            }

            answer[i] = queue.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int[] result = hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
