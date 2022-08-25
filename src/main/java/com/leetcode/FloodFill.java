package com.leetcode;


/**
 * @author: Yangx
 * @Date: 6/28/2022
 */
public class FloodFill {
    private static int count = 0;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rootColor = image[sr][sc];
        if (rootColor != color) {
            fill(image, sr, sc, rootColor, color);
        }
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int rootColor, int color) {
        if (sr < image.length && sr >= 0 && sc < image[0].length && sc >= 0 && rootColor == image[sr][sc]) {
            image[sr][sc] = color;
            count++;
            fill(image, sr + 1, sc, rootColor, color);
            fill(image, sr - 1, sc, rootColor, color);
            fill(image, sr, sc + 1, rootColor, color);
            fill(image, sr, sc - 1, rootColor, color);
        }
    }


    public static void main(String[] args) {

        //int[][] image = {{0,0,0},{0,0,0}};
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        new FloodFill().floodFill(image,1, 1, 2);
        System.out.println(FloodFill.count);

    }
}
