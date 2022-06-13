import java.util.Arrays;

class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] _arr1 = convertArr(arr1, n);
        int[][] _arr2 = convertArr(arr2, n);

        for(int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(_arr1[i][j] == 1 || _arr2[i][j] == 1) {
                    temp.append("#");
                } else {
                    temp.append(" ");
                }
            }
            answer[i] = temp.toString();
        }
        return answer;
    }

    public int[][] convertArr(int[] targetArr, int n) {
        int[][] result = new int[n][n];

        for(int i = 0; i < n; i++) {
            int[] reversedArr = new int[n];
            String targetBinary = new StringBuilder(Integer.toBinaryString(targetArr[i])).reverse().toString();
            String[] tempStrArr = targetBinary.split("");

            for(int j = 0; j < tempStrArr.length; j++) {
                reversedArr[j] = Integer.parseInt(tempStrArr[j]);
            }

            int[] trueArr = new int[n];
            int index = 0;
            for(int k = n - 1; k >= 0; k--) {
                trueArr[index] = reversedArr[k];
                index++;
            }
            result[i] = trueArr;
        }
        return result;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = secretMap.solution(n, arr1, arr2);
        System.out.println("result = " + Arrays.toString(result));
    }
}
