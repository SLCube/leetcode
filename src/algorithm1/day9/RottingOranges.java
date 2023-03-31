package algorithm1.day9;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    private static int[][] DIRECTIONS = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println("rottingOrange(grid) = " + rottingOrange(grid));
    }

    public static int rottingOrange(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int result = 0;
        int freshCount = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] currentPosition = queue.poll();

                for(int[] direction: DIRECTIONS) {
                    int positionY = currentPosition[0] + direction[0];
                    int positionX = currentPosition[1] + direction[1];

                    if(positionX < 0 || positionY < 0 || positionY >= grid.length || positionX >= grid[0].length || grid[positionY][positionX] != 1) {
                        continue;
                    }

                    grid[positionY][positionX] = 2;
                    freshCount--;
                    queue.add(new int[]{positionY, positionX});
                }
            }
            result++;
        }

        return freshCount > 0 ? -1 : result - 1;
    }
}
