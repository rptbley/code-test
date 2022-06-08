class ShareUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] sortedLost = sortAscending(lost);
        int[] sortedReserve = sortAscending(reserve);

        for(int i = 0; i < sortedReserve.length; i++) {
            for(int j = 0; j < sortedLost.length; j++) {
                if(sortedReserve[i] == sortedLost[j]) {
                    sortedReserve[i] = -1;
                    sortedLost[j] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i < sortedLost.length; i++) {
            if(sortedLost[i] == -1) continue;
            int student = sortedLost[i];

            for(int j = 0; j < sortedReserve.length; j++) {
                if(sortedReserve[j] == -1) continue;
                if(student - 1 == sortedReserve[j]) {
                    sortedReserve[j] = -1;
                    student = -1;
                    break;
                }

                if(student + 1 == sortedReserve[j]) {
                    sortedReserve[j] = -1;
                    student = -1;
                    break;
                }
            }
            if(student != -1) answer--;
        }
        return answer;
    }

    public int[] sortAscending(int[] targetList) {
        for(int i = 0; i < targetList.length; i++) {
            for(int j = i + 1; j < targetList.length; j++) {
                if(targetList[i] > targetList[j]) {
                    int temp = targetList[i];
                    targetList[i] = targetList[j];
                    targetList[j] = temp;
                }
            }
        }
        return targetList;
    }

    public static void main(String[] args) {
        ShareUniform shareUniform = new ShareUniform();
        int n = 5;
        int[] lost = {1,2,3,4,5};
        int[] reserve = {1,2,3,4,5};
        int result = shareUniform.solution(n, lost, reserve);
        System.out.println("result = " + result);
    }
}
