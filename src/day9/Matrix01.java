package day9;


import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    private static int[][] DIRECTIONS = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        updateMatrix(mat);
    }

    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {

            int[] currentPosition = queue.poll();

            for (int[] direction : DIRECTIONS) {
                int positionY = currentPosition[0] + direction[0];
                int positionX = currentPosition[1] + direction[1];

                if (positionX < 0 || positionY < 0 || positionX >= mat[0].length || positionY >= mat.length || mat[positionY][positionX] != -1) {
                    continue;
                }

                mat[positionY][positionX] = mat[currentPosition[0]][currentPosition[1]] + 1;
                queue.add(new int[]{positionY, positionX});
            }
        }
        return mat;
    }
}
