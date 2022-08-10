class GetUsableSquare {
    public long solution(int w, int h) {
        long answer = 1;
        long total = (long) w * h;
        return answer;
    }

    public static void main(String[] args) {
        GetUsableSquare getUsableSquare = new GetUsableSquare();
        long result = getUsableSquare.solution(8, 12);
        System.out.println("result = " + result);
    }
}
