class GetMiddleChar {
    public String solution(String s) {
        int length = s.length();
        String[] strList = s.split("");
        if(length % 2 == 0) {
            return strList[length / 2 - 1] + strList[length / 2];
        } else {
            return strList[length / 2];
        }
    }

    public static void main(String[] args) {
        GetMiddleChar getMiddleChar = new GetMiddleChar();
        String result = getMiddleChar.solution("qwer");
        System.out.println("result = " + result);
    }
}
