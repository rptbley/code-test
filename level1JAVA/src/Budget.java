class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        for(int i = 0; i < d.length; i++) {
            for(int j = i + 1; j < d.length; j++) {
                if(d[i] > d[j]) {
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        if(budget == sum) return d.length;

        int restBudget = budget;
        for(int i = 0; i < d.length; i++) {
            int useResult = restBudget - d[i];

            if(useResult >= 0) {
                restBudget = useResult;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Budget budget = new Budget();
        int[] d = {1,1,1};
        int _budget = 2;
        int result = budget.solution(d, _budget);
        System.out.println("result = " + result);
    }
}
