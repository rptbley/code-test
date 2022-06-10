import java.util.TreeSet;

class PickTwoAndAdd {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> addedNumList = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                addedNumList.add(numbers[i] + numbers[j]);
            }
        }

        return addedNumList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        PickTwoAndAdd pickTwoAndAdd = new PickTwoAndAdd();
        int[] numbers = {2,1,3,4,1};
        int[] result = pickTwoAndAdd.solution(numbers);
        for(int r : result) {
            System.out.print(r + ", ");
        }
    }
}
