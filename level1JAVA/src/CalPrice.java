class CalPrice {
    public long solution(int price, int money, int count) {
        return Math.max(((long) price * count * (count + 1)) / 2 - money, 0);
    }

    public static void main(String[] args) {
        CalPrice calPrice = new CalPrice();
        long result = calPrice.solution(3, 20, 4);
        System.out.println("result = " + result);
    }
}
