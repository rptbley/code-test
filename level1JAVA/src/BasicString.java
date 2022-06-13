class BasicString {
    public boolean solution(String s) {
        String answer = s.replaceAll("[^0-9]", "");
        if(answer.equals(s)) return answer.matches(".{4}") || answer.matches(".{6}");
        return false;
    }

    public static void main(String[] args) {
        BasicString basicString = new BasicString();
        boolean result = basicString.solution("1234");
        System.out.println("result = " + result);
    }
}
