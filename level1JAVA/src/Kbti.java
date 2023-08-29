import java.util.HashMap;

public class Kbti {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();

        char[] kbtiArr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        HashMap<Character, Integer> kbtiMap = new HashMap<>();
        for (char kbti : kbtiArr) {
            kbtiMap.put(kbti, 0);
        }

        for(int i = 0; i < survey.length; i++) {
            char[] targetSurvey = survey[i].toCharArray();
            int surveyResultIndex = -1;
            int score = 0;
            int targetSurveyAnswer = choices[i];

            if(targetSurveyAnswer == 4) continue;

            if(1 <= targetSurveyAnswer && targetSurveyAnswer <= 3) {
                switch(targetSurveyAnswer) {
                    case 1:
                        score = 3;
                        break;
                    case 2:
                        score = 2;
                        break;
                    case 3:
                        score = 1;
                        break;
                }
                surveyResultIndex = 0;
            } else {
                switch(targetSurveyAnswer) {
                    case 5:
                        score = 1;
                        break;
                    case 6:
                        score = 2;
                        break;
                    case 7:
                        score = 3;
                        break;
                }
                surveyResultIndex = 1;
            }

            kbtiMap.put(targetSurvey[surveyResultIndex], kbtiMap.get(targetSurvey[surveyResultIndex]) + score);
        }

        for(int i = 0; i < kbtiArr.length - 1; i+=2) {
            char firstIndicator = kbtiArr[i];
            char secondIndicator = kbtiArr[i + 1];

            int firstIndicatorScore = kbtiMap.get(firstIndicator);
            int secondIndicatorScore = kbtiMap.get(secondIndicator);

            if(firstIndicatorScore > secondIndicatorScore) answer.append(firstIndicator);
            if(firstIndicatorScore < secondIndicatorScore) answer.append(secondIndicator);
            if(firstIndicatorScore == secondIndicatorScore) answer.append((char) Math.min(firstIndicator, secondIndicator));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println("solution = " + new Kbti().solution(survey, choices));
    }
}
