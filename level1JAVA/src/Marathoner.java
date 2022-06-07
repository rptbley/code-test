import java.util.Arrays;
import java.util.Stack;

class Marathoner {
    public String solution(String[] participant, String[] completion) {
        Stack<String> completionStack = new Stack<>();
        for(String c : completion) {
            completionStack.push(c);
        }

        while(!completionStack.isEmpty()) {
            String completeRunner = completionStack.pop();
            int targetIndex = Arrays.asList(participant).indexOf(completeRunner);
            if(targetIndex != -1) Arrays.asList(participant).remove(targetIndex);
        }
        String answer = participant[0];
        return answer;
    }

    public static void main(String[] args) {
        Marathoner marathoner = new Marathoner();
        String result = marathoner.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("result = " + result);
    }
}
