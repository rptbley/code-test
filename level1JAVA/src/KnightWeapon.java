class KnightWeapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            int sumOfGCD = 0;

            for(int k = 1; k <= i; k++) {
                if(i % k == 0) {
                    sumOfGCD++;
                }
            }

            answer += sumOfGCD > limit ? power : sumOfGCD;
        }
        return answer;
    }

    public static void main(String[] args) {
        KnightWeapon knightWeapon = new KnightWeapon();
        int result = knightWeapon.solution(10, 3, 2);
        System.out.println("result = " + result);
    }
}
