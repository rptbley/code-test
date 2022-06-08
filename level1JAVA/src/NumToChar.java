class NumToChar {
    public int solution(String s) {
        String[] numList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numList.length; i++) {
            s = s.replaceAll(numList[i], i + "");
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        NumToChar numToChar = new NumToChar();
        int result = numToChar.solution("one4seveneight");
        System.out.println("result = " + result);
    }
}
