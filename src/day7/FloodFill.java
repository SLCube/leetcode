package day7;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] result = floodFill(image, sr, sc, color);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int criteria = image[sr][sc];
        changeColor(image, sr, sc, color, criteria);
        return image;
    }

    public static void changeColor(int[][] image, int sr, int sc, int color, int criteria) {
        if (image[sr][sc] == color) {
            return;
        }

        image[sr][sc] = color;

        if (sr + 1 < image.length && image[sr + 1][sc] == criteria) {
            changeColor(image, sr + 1, sc, color, criteria);
        }

        if (sc + 1 < image[sr].length && image[sr][sc + 1] == criteria) {
            changeColor(image, sr, sc + 1, color, criteria);
        }

        if (sr - 1 >= 0 && image[sr - 1][sc] == criteria) {
            changeColor(image, sr - 1, sc, color, criteria);
        }

        if (sc - 1 >= 0 && image[sr][sc - 1] == criteria) {
            changeColor(image, sr, sc - 1, color, criteria);
        }
    }

}
