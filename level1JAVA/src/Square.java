import java.util.TreeSet;

class Square {
    public int solution(int[][] sizes) {
        TreeSet<Integer> width = new TreeSet<>();
        TreeSet<Integer> height = new TreeSet<>();

        for(int i = 0; i < sizes.length; i++) {
            int[] targetWallet = sizes[i];
            int targetWidth = targetWallet[0];
            int targetHeight = targetWallet[1];

            if(targetWidth > targetHeight) {
                width.add(targetWidth);
                height.add(targetHeight);
            } else {
                width.add(targetHeight);
                height.add(targetWidth);
            }
        }
        return width.last() * height.last();
    }

    public static void main(String[] args) {
        Square square = new Square();
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40},
        };
        int result = square.solution(sizes);
        System.out.println("result = " + result);
    }
}
