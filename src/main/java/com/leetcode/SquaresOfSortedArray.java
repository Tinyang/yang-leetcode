package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/25/2022
 */
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int[] array = new int[nums.length];
        int newArrayIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            while (nums[startIndex] * nums[startIndex] < nums[endIndex] * nums[endIndex]) {
                array[newArrayIndex] = nums[endIndex] * nums[endIndex];
                newArrayIndex --;
                endIndex --;
            }
            array[newArrayIndex] = nums[startIndex] * nums[startIndex];
            newArrayIndex --;
            startIndex ++;
        }
        return array;
    }


    public static void main(String[] args) {
        //int[] nums = {-4,-1,0,3,10};
        int[] nums = {-7,-3,2,3,11};
        new SquaresOfSortedArray().sortedSquares(nums);



    }
}
