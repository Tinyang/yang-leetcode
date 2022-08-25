package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/25/2022
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int index = 0;
        int value = nums[index];
        int newIndex = -1;
        while (newIndex != 0) {
            newIndex = getNewIndex(index, nums.length, k);
            int tempValue = nums[newIndex];
            nums[newIndex] = value;
            value = tempValue;
            index = newIndex;
        }
    }

    private int getNewIndex(int oldIndex, int length, int k) {
        if ((oldIndex + k) < length) {
            return oldIndex + k;
        } else {
            return oldIndex + k - length;
        }
    }

    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6,7};
        int[] array = {-1,-100,3,99};
        new RotateArray().rotate(array, 2);

    }

}
