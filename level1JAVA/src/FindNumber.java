class FindNumber {
    public int solution(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) return i;
        }
        return n - 1;
    }

    public static void main(String[] args) {
        FindNumber findNumber = new FindNumber();
        int result = findNumber.solution(10);
        System.out.println("result = " + result);
    }
}
