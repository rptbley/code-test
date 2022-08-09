import java.util.ArrayList;
import java.util.List;

class CompressionString {
    public int solution(String s) {
        int answer = 0;

        boolean isEven = s.length() % 2 == 0;
        int divideNum = isEven ? s.length() / 2 : s.length() / 3;

        for(int i = divideNum; i > 0; i--) {
            List<String> parsedStrList = parseStr(s, i);
            int parsedStrLength = checkList(parsedStrList);

            if(i == divideNum) {
                answer = parsedStrLength;
            }

            if(answer > parsedStrLength) {
                answer = parsedStrLength;
            }
        }
        return answer;
    }

    public List<String> parseStr(String s, int divideNum) {
        List<String> parsedStrList = new ArrayList<>();

        for(int i = 0; i < s.length(); i += divideNum) {
            int endIndex = divideNum + i;

            if(endIndex > s.length()) break;

            String parsedStr = s.substring(i, endIndex);
            parsedStrList.add(parsedStr);
        }

        return parsedStrList;
    }

    public int checkList(List<String> parsedStrList) {
        int dupleNum = 1;
        StringBuilder result = new StringBuilder();
        String currentStr = "";

        for(int i = 0; i < parsedStrList.size(); i++) {
            if(i == 0) {
                currentStr = parsedStrList.get(i);
            }
            
            if(i + 1 < parsedStrList.size() - 1) {
                String nextStr = parsedStrList.get(i + 1);

                if(currentStr.equals(nextStr)) {
                    dupleNum++;
                } else {
                    result.append(dupleNum == 1 ? currentStr : dupleNum + currentStr);
                    dupleNum = 1;
                    currentStr = nextStr;
                }
            } else {
                if(!parsedStrList.get(i).equals(currentStr)) {
                    result.append(parsedStrList.get(i));
                }
            }
        }
        System.out.println("result = " + result);
        return result.toString().length();
    }

    public static void main(String[] args) {
        CompressionString compressionString = new CompressionString();
        int result = compressionString.solution("ababcdcdababcdcd");
        System.out.println("result = " + result);
    }
}
