import java.util.ArrayList;
import java.util.List;

public class KreinGame {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        KreinGame kreinGame = new KreinGame();
        System.out.println("result = " + kreinGame.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> pickedDollContainer = new ArrayList<>();
        Container container = new Container(board.length);
        container.setTurnedBoard(board);

        for(int move : moves) {
            int doll = container.getDollNumber(move);
            if(doll != 0) {
                if(pickedDollContainer.size() == 0) {
                    pickedDollContainer.add(doll);
                    continue;
                }
                int beforePickedDoll = pickedDollContainer.get(pickedDollContainer.size() - 1);
                if(doll != beforePickedDoll) {
                    pickedDollContainer.add(doll);
                    continue;
                }
                pickedDollContainer.remove(pickedDollContainer.size() - 1);
                answer += 2;
            }
        }

        return answer;
    }

    public class Container {
        private int[][] turnedBoard;
        private int boardLength;

        public Container(int boardLength) {
            this.boardLength = boardLength;
        }

        public void setTurnedBoard(int[][] board) {
            int[][] turnedBoard = new int[this.boardLength][this.boardLength];
            for(int i = 0; i < this.boardLength; i++) {
                for(int j = 0; j < this.boardLength; j++) {
                    turnedBoard[i][j] = board[j][i];
                }
            }
            this.turnedBoard = turnedBoard;
        }

        public int getDollNumber(int targetLineIndex) {
            int result = 0;
            for(int i = 0; i < this.boardLength; i++) {
                int temp = this.turnedBoard[targetLineIndex - 1][i];
                if(temp != 0) {
                    result = temp;
                    this.turnedBoard[targetLineIndex - 1][i] = 0;
                    break;
                }
            }
            return result;
        }
    }
}
