public class ClearWallpaper {
    public int[] solution(String[] wallpaper) {
        int up = 0;
        int left = wallpaper[0].length();
        int down = 0;
        int right = 0;

        boolean upFlag = false;

        for(int height = 0; height < wallpaper.length; height++) {
            String row = wallpaper[height];
            if(!row.contains("#")) continue;

            if(!upFlag) {
                up = height;
                upFlag = true;
            }

            int leftWidth = row.indexOf("#");
            int rightWidth = row.lastIndexOf("#");

            if(left >= leftWidth) left = leftWidth;
            if(down <= height) down = height + 1;
            if(right <= rightWidth) right = rightWidth + 1;
        }

        return new int[]{up, left, down, right};
    }

    public static void main(String[] args) {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int[] solution = new ClearWallpaper().solution(wallpaper);

        for (int i : solution) {
            System.out.print(i + ", ");
        }
    }
}
