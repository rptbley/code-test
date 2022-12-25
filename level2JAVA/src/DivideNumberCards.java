class DivideNumberCards {
  public int solution(int[] arrayA, int[] arrayB) {
    int arrayAGcd = getGCDFromArray(arrayA);
    int arrayBGcd = getGCDFromArray(arrayB);

    boolean isArrayADivided = isDividedByGcd(arrayBGcd, arrayA);
    boolean isArrayBDivided = isDividedByGcd(arrayAGcd, arrayB);

    if(isArrayADivided && !isArrayBDivided) return arrayAGcd;
    if(!isArrayADivided && isArrayBDivided) return arrayBGcd;
    if(!isArrayADivided && !isArrayBDivided) {
      return Math.max(arrayAGcd, arrayBGcd);
    }

    return 0;
  }

  public boolean isDividedByGcd(int gcd, int[] targetArray) {
    for(int i = 0; i < targetArray.length; i++) {
      if(targetArray[i] % gcd == 0) {
        return true;
      }
    }

    return false;
  }

  public int getGCDFromArray(int[] targetArray) {
    int targetGcd = getGCD(targetArray[0], targetArray[1]);

    if(targetArray.length > 2) {
      for(int i = 2; i < targetArray.length; i++) {
        targetGcd = getGCD(targetGcd, targetArray[i]);
      }
    }

    return targetGcd;
  }

  public int getGCD(int a, int b) {
    if(b == 0) return a;
    return getGCD(b, a%b);
  }

  public static void main(String[] args) {
    DivideNumberCards solution = new DivideNumberCards();

    int[] arrayA = new int[]{10, 20};
    int[] arrayB = new int[]{5, 10, 17};

    int result = solution.solution(arrayA, arrayB);

    System.out.println("result = " + result);
  }
}
