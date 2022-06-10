class GetWeekOfDay {
    public String solution(int a, int b) {
        int[] dayLengthOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekOfDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int targetDay = b;
        for(int i = 0; i < a; i++) {
            targetDay += dayLengthOfMonth[i];
        }

        int targetWeekOfDayIndex = targetDay % 7;

        return weekOfDay[(targetWeekOfDayIndex == 0 ? weekOfDay.length : targetWeekOfDayIndex) - 1];
    }

    public static void main(String[] args) {
        GetWeekOfDay getWeekOfDay = new GetWeekOfDay();
        String result = getWeekOfDay.solution(5, 24);
        System.out.println("result = " + result);
    }
}
