import java.util.ArrayList;
import java.util.List;

class MakingHamburger {
    public int solution(int[] ingredient) {
        int answer = 0;

        List<Integer> queue = new ArrayList<>();

        for (int i : ingredient) {
            queue.add(i);

            int size = queue.size();
            if(size >= 4) {
                if(queue.get(size - 1) == 1 && queue.get(size - 2) == 3 && queue.get(size - 3) == 2 && queue.get(size - 4) == 1) {
                    for(int j = 0; j < 4; j++) {
                        queue.remove(queue.size() - 1);
                    }
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MakingHamburger makingHamburger = new MakingHamburger();
        int result = makingHamburger.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println("result = " + result);
    }
}

// 1 = 빵
// 2 = 야채
// 3 = 고기
