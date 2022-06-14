class Clap {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++) {
            answer.append(i % 2 == 0 ? "수" : "박");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Clap clap = new Clap();
        String result = clap.solution(3);
        System.out.println("result = " + result);
    }
}
