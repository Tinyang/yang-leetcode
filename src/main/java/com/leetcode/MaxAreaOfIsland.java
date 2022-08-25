package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/30/2022
 */
public class MaxAreaOfIsland {
    private int maxIslandArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++ ) {
            for (int j = 0; j < grid[i].length; j++) {
                int lastMaxIslandArea = maxIslandArea;
                maxIslandArea = 0;
                maxIslandArea = Math.max(lastMaxIslandArea, calculateIslandSize(grid, i, j, visited));
            }
        }
        return maxIslandArea;
    }

    public int calculateIslandSize(int[][] grid, int sr, int sc, int[][] visited) {
        if (sr < grid.length && sr >= 0 && sc < grid[0].length && sc >= 0 && grid[sr][sc] == 1 && visited[sr][sc] == 0) {
            visited[sr][sc] = 1;
            maxIslandArea++;
            calculateIslandSize(grid, sr + 1, sc, visited);
            calculateIslandSize(grid, sr - 1, sc, visited);
            calculateIslandSize(grid, sr, sc + 1, visited);
            calculateIslandSize(grid, sr, sc - 1, visited);
            return maxIslandArea;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[][] array = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(new MaxAreaOfIsland().maxAreaOfIsland(array));
    }
}
