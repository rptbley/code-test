class FoodFight {
    public String solution(int[] food) {
        StringBuilder temp = new StringBuilder();

        for(int targetFood = 1; targetFood < food.length; targetFood++) {
            int foodCount = food[targetFood];

            int setFoodCount = foodCount / 2;

            temp.append(String.valueOf(targetFood).repeat(setFoodCount));
        }

        String front = temp.toString();
        String back = temp.reverse().toString();

        return front + "0" + back;
    }

    public static void main(String[] args) {
        FoodFight foodFight = new FoodFight();
        String result = foodFight.solution(new int[]{1,3,4,6});
        System.out.println("result = " + result);
    }
}
