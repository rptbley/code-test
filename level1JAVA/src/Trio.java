public class Trio {
    public int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++) {
            int firstStudent = number[i];

            for(int j = i + 1; j < number.length; j++) {
                int secondStudent = number[j];

                for(int k = j + 1; k < number.length; k++) {
                    if(firstStudent + secondStudent + number[k] == 0) answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] number = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};
        System.out.println("solution = " + new Trio().solution(number));
    }
}
