public class WalkingPark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int maxHeight = park.length;
        int maxWidth = park[0].length();

        for(int i = 0; i < park.length; i++) {
            String[] row = park[i].split("");

            for(int j = 0; j < row.length; j++) {
                if(row[j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        for (String route : routes) {
            String[] row = route.split(" ");

            String op = row[0];
            int n = Integer.parseInt(row[1]);
            boolean obstacleFlag = false;

            switch(op) {
                case "W":
                    if(answer[1] - n < 0) continue;
                    String[] wRow = park[answer[0]].split("");
                    for(int i = 1; i < n; i++) {
                        for(int j = answer[1]; j >= answer[1] - n; j--) {
                            if(wRow[j].equals("X")) {
                                obstacleFlag = true;
                                break;
                            }
                        }
                    }
                    if(!obstacleFlag) answer[1] = answer[1] - n;
                    break;
                case "N":
                    if(answer[0] - n < 0) continue;
                    for(int i = 1; i < n; i++) {
                        String[] nRow = park[answer[0] - i].split("");
                        if(nRow[answer[1]].equals("X")) {
                            obstacleFlag = true;
                            break;
                        }
                    }
                    if(!obstacleFlag) answer[0] = answer[0] - n;
                    break;
                case "E":
                    if(answer[1] + n >= maxWidth) continue;
                    String[] eRow = park[answer[0]].split("");
                    for(int i = 1; i < n; i++) {
                        for(int j = answer[1]; j < answer[1] + n; j++) {
                            if(eRow[j].equals("X")) {
                                obstacleFlag = true;
                                break;
                            }
                        }
                    }
                    if(!obstacleFlag) answer[1] = answer[1] + n;
                    break;
                case "S":
                    if(answer[0] + n >= maxHeight) continue;
                    for(int i = 1; i < n; i++) {
                        String[] sRow = park[answer[0] + i].split("");
                        if(sRow[answer[1]].equals("X")) {
                            obstacleFlag = true;
                            break;
                        }
                    }
                    if(!obstacleFlag) answer[0] = answer[0] + n;
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        int[] solution = new WalkingPark().solution(park, routes);

        for (int i : solution) {
            System.out.print(i + ", ");
        }
    }
}
