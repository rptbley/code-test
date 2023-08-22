public class DeckOfCard {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for(int i = 0; i < goal.length; i++) {
            String goalStr = goal[i];

            if(card1Index < cards1.length && goalStr.equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if(card2Index < cards2.length && goalStr.equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }

            answer = "No";
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] cards1 = {"i","drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String solution = new DeckOfCard().solution(cards1, cards2, goal);
        System.out.println(solution);
    }
}
