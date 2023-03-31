package algorithm1.day7;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };


        int result = maxAreaOfIsland(grid);
        System.out.println("result = " + result);
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!isVisited[i][j]) {
                    maxArea = Math.max(calculateArea(grid, j, i, isVisited), maxArea);
                }
            }
        }
        return maxArea;
    }

    private static int calculateArea(int[][] grid, int positionX, int positionY, boolean[][] isVisited) {
        int area = 1;
        isVisited[positionY][positionX] = true;

        if (grid[positionY][positionX] == 0) {
            return 0;
        }

        if (positionY - 1 >= 0 && grid[positionY - 1][positionX] == 1 && !isVisited[positionY - 1][positionX]) {
            area += calculateArea(grid, positionX, positionY - 1, isVisited);
        }

        if (positionY + 1 < grid.length && grid[positionY + 1][positionX] == 1 && !isVisited[positionY + 1][positionX]) {
            area += calculateArea(grid, positionX, positionY + 1, isVisited);
        }

        if (positionX - 1 >= 0 && grid[positionY][positionX - 1] == 1 && !isVisited[positionY][positionX - 1]) {
            area += calculateArea(grid, positionX - 1, positionY, isVisited);
        }

        if (positionX + 1 < grid[positionY].length && grid[positionY][positionX + 1] == 1 && !isVisited[positionY][positionX + 1]) {
            area += calculateArea(grid, positionX + 1, positionY, isVisited);
        }

        return area;
    }
}
