class AddIndex {
    public int solution(int n) {
        int answer = 0;
        int target = n;
        int divisor = 10;
        while(target != 0) {
            int temp = target % divisor;
            answer += temp;
            target /= divisor;
        }

        return answer;
    }

    public static void main(String[] args) {
        AddIndex addIndex = new AddIndex();
        int result = addIndex.solution(123);
        System.out.println("result = " + result);
    }
}
