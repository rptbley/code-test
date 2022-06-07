import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GetNum {
    private List<Integer> personOne = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    private List<Integer> personTwo = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
    private List<Integer> personThree = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int lengthDivideByFive = answers.length / 5;
        int lengthRest = answers.length % 5 != 0 ? 1 : 0;
        int length = lengthDivideByFive + lengthRest;

        int one = getAnswerCount(answers, length, personOne);
        int two = getAnswerCount(answers, length, personTwo);
        int three = getAnswerCount(answers, length, personThree);

        int[] countArr = {one, two, three};
        int maxCount = 0;
        for(int i = 0; i < countArr.length; i++) {
            if(maxCount < countArr[i]) maxCount = countArr[i];
        }

        for(int i = 0; i < countArr.length; i++) {
            if(maxCount == countArr[i]) answer.add(i + 1);
        }
        return answer;
    }

    public int getAnswerCount(int[] answers, int length, List<Integer> targetPerson) {
        List<Integer> answerSheet = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            answerSheet.addAll(targetPerson);
        }

        int answerCount = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == answerSheet.get(i)) answerCount++;
        }

        return answerCount;
    }

    public static void main(String[] args) {
        GetNum getNum = new GetNum();
        int[] answers = new int[]{1,3,2,4,2};
        List<Integer> result = getNum.solution(answers);

        System.out.println("result = " + result);
    }
}
