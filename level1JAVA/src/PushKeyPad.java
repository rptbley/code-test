public class PushKeyPad {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = solution(numbers, hand);

        System.out.println(result);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keyPad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {11, 0, 12}
        };
        int leftPosition = 11;
        int rightPosition = 12;

        for(int target : numbers) {
            if(target == 1 || target == 4 || target == 7) {
                leftPosition = target;
                answer.append("L");
                continue;
            }

            if(target == 3 || target == 6 || target == 9) {
                rightPosition = target;
                answer.append("R");
                continue;
            }

            int[] leftIndex = new int[2];
            int[] rightIndex = new int[2];
            int[] targetIndex = new int[2];

            for(int i = 0; i < keyPad.length; i++) {
                for(int j = 0; j < keyPad[i].length; j++) {
                    int keyPadNumber = keyPad[i][j];
                    if(keyPadNumber == leftPosition) {
                        leftIndex[0] = i;
                        leftIndex[1] = j;
                    }
                    if(keyPadNumber == rightPosition) {
                        rightIndex[0] = i;
                        rightIndex[1] = j;
                    }
                    if(keyPadNumber == target) {
                        targetIndex[0] = i;
                        targetIndex[1] = j;
                    }
                }
            }

            double leftLength = Math.abs(leftIndex[0] - targetIndex[0]) + Math.abs(leftIndex[1] - targetIndex[1]);
            double rightLength = Math.abs(rightIndex[0] - targetIndex[0]) + Math.abs(rightIndex[1] - targetIndex[1]);

            if(leftLength < rightLength) {
                answer.append("L");
                leftPosition = target;
            } else if(leftLength > rightLength) {
                answer.append("R");
                rightPosition = target;
            } else {
                if(hand.equals("right")) {
                    answer.append("R");
                    rightPosition = target;
                } else {
                    answer.append("L");
                    leftPosition = target;
                }
            }
        }
        return answer.toString();
    }
}
