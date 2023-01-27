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

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        fill(image, sr, sc, image[sr][sc], color);

        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;

            if (0 <= sr - 1) {
                fill(image, sr - 1, sc, color, newColor);
            }
            if (0 <= sc - 1) {
                fill(image, sr, sc - 1, color, newColor);
            }

            if (sr + 1 < image.length) {
                fill(image, sr + 1, sc, color, newColor);
            }

            if (sc + 1 < image[0].length) {
                fill(image, sr, sc + 1, color, newColor);
            }
        }
    }
}
