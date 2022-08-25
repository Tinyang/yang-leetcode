package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/26/2022
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer++] = nums[i];
            }
        }
        for (; pointer < nums.length; pointer++) {
            nums[pointer] = 0;
        }
    }
}
