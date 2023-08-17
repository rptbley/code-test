import java.util.Arrays;
import java.util.HashMap;

public class Race {

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            Integer calledPlayerIndex = playerMap.get(calling);
            int frontPlayerIndex = calledPlayerIndex - 1;
            String frontPlayer = players[frontPlayerIndex];

            if(calledPlayerIndex == 0) continue;

            players[frontPlayerIndex] = calling;
            players[calledPlayerIndex] = frontPlayer;

            playerMap.put(calling, frontPlayerIndex);
            playerMap.put(frontPlayer, calledPlayerIndex);
        }

        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Race race = new Race();
        String[] solution = race.solution(players, callings);

        System.out.println(Arrays.asList(solution));
    }
}
