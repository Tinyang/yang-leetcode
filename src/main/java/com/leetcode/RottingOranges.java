package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 7/4/2022
 */
public class RottingOranges {

    /*0 representing an empty cell,
    1 representing a fresh orange, or
    2 representing a rotten orange.*/
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int freshOrangeNumber = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOrangeNumber++;
                }
            }
        }
        if (freshOrangeNumber == 0) {
            return 0;
        }
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rottenOrange = queue.remove();
                int tempX = rottenOrange[0];
                int tempY = rottenOrange[1];
                for (int[] direction : directions) {
                    int x = tempX + direction[0];
                    int y = tempY + direction[1];
                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 2 || grid[x][y] == 0) {
                        continue;
                    } else {
                        grid[x][y] = 2;
                        freshOrangeNumber--;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
        if (freshOrangeNumber > 0) {
            return -1;
        } else {
            return count - 1;
        }
    }
}
