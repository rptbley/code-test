import java.util.ArrayList;
import java.util.List;

public class AddPlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        List<Integer> resultArr = new ArrayList<>();
        for(int i = 0; i < absolutes.length; i++) {
            resultArr.add(signs[i] ? absolutes[i] : absolutes[i] * -1);
        }

        int resultInt = 0;
        for(Integer result : resultArr) {
            resultInt += result;
        }
        return resultInt;
    }

    public static void main(String[] args) {
        AddPlusMinus addPlusMinus = new AddPlusMinus();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int result = addPlusMinus.solution(absolutes, signs);
        System.out.println("result = " + result);
    }
}
