import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        List<FailRateVO> failRateList = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            int targetStage = i;
            int stageCount = 0;
            int failCount = 0;
            for(int stage : stages) {
                if(stage >= targetStage) stageCount++;
                if(stage == targetStage) failCount++;
            }
            float failRate = stageCount == 0 ? 0f : (float) failCount / stageCount;
            FailRateVO failRateVO = new FailRateVO(targetStage, failRate);
            failRateList.add(failRateVO);
        }

        Collections.sort(failRateList, new FailRateComparator().reversed());

        for(int i = 0; i < failRateList.size(); i++) {
            answer[i] = failRateList.get(i).getStage();
        }
        return answer;
    }

    class FailRateVO{
        private int stage;
        private float failRate;

        public FailRateVO(int stage, float failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }

        public int getStage() { return this.stage; }
        public float getFailRate() { return this.failRate; }
    }

    class FailRateComparator implements Comparator<FailRateVO> {
        @Override
        public int compare(FailRateVO vo1, FailRateVO vo2) {
            if(vo1.getFailRate() > vo2.getFailRate()) {
                return 1;
            } else if(vo1.getFailRate() < vo2.getFailRate()) {
                return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        FailRate failRate = new FailRate();
        int n = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] result = failRate.solution(n, stages);

        for(int r : result) {
            System.out.print(r + ", ");
        }
    }
}
