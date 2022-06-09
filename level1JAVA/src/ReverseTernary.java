class ReverseTernary {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        String reversedTernary = new StringBuffer(ternary).reverse().toString();
        return Integer.parseInt(reversedTernary, 3);
    }

    public static void main(String[] args) {
        ReverseTernary reverseTernary = new ReverseTernary();
        int result = reverseTernary.solution(45);
        System.out.println("result = " + result);
    }
}
