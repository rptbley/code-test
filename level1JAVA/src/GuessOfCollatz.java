class GuessOfCollatz {
    public int solution(int num) {
        long result = num;
        for(int i = 0; i <= 500; i++) {
            if(result == 1) return i;
            result = result % 2 == 0 ? result / 2 : result * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        GuessOfCollatz guessOfCollatz = new GuessOfCollatz();
        System.out.println("result = " + guessOfCollatz.solution(626331));
    }
}
