import java.util.Arrays;

class FruitSeller {
  public int solution(int k, int  m, int[] score) {
    int answer = 0;

    Arrays.sort(score);

    int[] reverceList = new int[score.length];

    for(int i = 0; i < score.length; i++) {
      reverceList[i] = score[score.length - 1 - i];
    }

    for(int i = m - 1; i < score.length; i += m) {
      int boxPrice = reverceList[i] * m;
      answer += boxPrice;
    }

    return answer;
  }

  public static void main(String[] args) {
    FruitSeller fruitSeller = new FruitSeller();
    int result = fruitSeller.solution(4, 3, new int[]{4,1,2,2,4,4,4,4,1,2,4,2});
    System.out.println("result = " + result);
  }
}
