import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class NumOfIndexK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] target = commands[i];
            int startIndex = target[0] - 1;
            int endIndex = target[1] - 1;
            int findIndex = target[2] - 1;

            List<Integer> temp = new ArrayList<>();
            for(int j = startIndex; j <= endIndex; j++) {
                temp.add(array[j]);
            }

            List<Integer> sortedList = sortAscending(temp);

            System.out.println("sortedList = " + sortedList);
            answer[i] = sortedList.get(findIndex);
        }
        return answer;
    }

    public List<Integer> sortAscending(List<Integer> targetList) {
        for(int i = 0; i < targetList.size(); i++) {
            for(int j = i + 1; j <targetList.size(); j++) {
                if(targetList.get(i) > targetList.get(j)) {
                    int temp = targetList.get(i);
                    targetList.set(i, targetList.get(j));
                    targetList.set(j, temp);
                }
            }
        }
        return targetList;
    }

    public static void main(String[] args) {
        NumOfIndexK numOfIndexK = new NumOfIndexK();

        int[] result = numOfIndexK.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(5);
        test.add(2);
        test.add(6);
        test.add(3);
        test.add(7);
        test.add(4);
//        numOfIndexK.sortAscending(test);
        System.out.println("result = " + Arrays.toString(result));
    }
}
