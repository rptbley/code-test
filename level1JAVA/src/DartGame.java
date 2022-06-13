import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        String regEx = "([0-9]{1,2})([SDT])([#*]?)";
        Pattern pattern = Pattern.compile(regEx);
        List<String> roundList = new ArrayList<>();

        Matcher matcher = pattern.matcher(dartResult);
        while(matcher.find()) {
            roundList.add(matcher.group());
        }

        int[] scoreList = {0, 0, 0};
        int index = 0;
        for(String round : roundList) {
            String[] roundInfo = round.replaceAll("[0-9]", "").split("");
            int defaultScore = Integer.parseInt(round.replaceAll("[^0-9]", ""));
            int finalScore = 0;
            String shot = roundInfo[0];
            String bonus = "";
            if(roundInfo.length >= 2) {
                bonus = roundInfo[1];
            }

            switch(shot) {
                case "S" :
                    finalScore = defaultScore;
                    break;
                case "D" :
                    finalScore = (int) Math.pow(defaultScore, 2);
                    break;
                case "T" :
                    finalScore = (int) Math.pow(defaultScore, 3);
                    break;
            }

            scoreList[index] = finalScore;

            switch(bonus) {
                case "*" :
                    if(index != 0) {
                        scoreList[index - 1] *= 2;
                    }
                    scoreList[index] *= 2;
                    break;
                case "#" :
                    scoreList[index] *= -1;
                    break;
                default : break;
            }
            index++;
        }

        for(Integer score : scoreList) {
            answer += score;
        }

        return answer;
    }

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        int result = dartGame.solution("1D2S#10S");
        System.out.println("result = " + result);
    }
}
