class MakingHamburger {
    int bread = 1;
    int vegetable = 2;
    int meat = 3;

    public int solution(int[] ingredients) {
        int answer = 0;
        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0; i < ingredients.length - 3; i++) {
            if(ingredients[i] == bread && ingredients[i + 1] == vegetable && ingredients[i + 2] == meat && ingredients[i + 3] == bread) {
                answer++;
                startIndex = i;
                endIndex = i + 3;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MakingHamburger makingHamburger = new MakingHamburger();
        int result = makingHamburger.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println("result = " + result);
    }
}

// 1 = 빵
// 2 = 야채
// 3 = 고기
