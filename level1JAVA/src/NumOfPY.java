class NumOfPY {
    boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() == s.replaceAll("[^yY]", "").length();
    }

    public static void main(String[] args) {
        NumOfPY numOfPY = new NumOfPY();
        boolean result = numOfPY.solution("pPoooyY");
        System.out.println("result = " + result);
    }
}
