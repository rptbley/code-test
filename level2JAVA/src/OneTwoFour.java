class OneTwoFour {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        int targetNum = n;

        while(targetNum != 0) {
            int numOfThree = targetNum / 3;
            int restNum = targetNum % 3;

            if(restNum == 0) {
                numOfThree--;
                restNum = 4;
            }

            answer.insert(0, restNum);

            targetNum = numOfThree;
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        OneTwoFour oneTwoFour = new OneTwoFour();
        for(int i = 1; i <= 40; i++) {
            System.out.print("i = " + i + " ");
            System.out.println("result = " + oneTwoFour.solution(i));
        }
    }
}
