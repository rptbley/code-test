class KnightWeapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            double sqrt = Math.sqrt(i);
            int sum = 0;

            for(int k = 1; k <= sqrt; k++) {
                if(k * k == i) {
                    sum++;
                } else if(i % k == 0) {
                    sum += 2;
                }
            }

            answer += sum > limit ? power : sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        KnightWeapon knightWeapon = new KnightWeapon();
        int result = knightWeapon.solution(10, 3, 2);
        System.out.println("result = " + result);
    }
}
