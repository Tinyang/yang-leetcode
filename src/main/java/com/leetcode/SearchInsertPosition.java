package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/24/2022
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (target <= nums[start]) {return 0;}
        if (target >= nums[end]) {return nums.length - 1;}
        while ((end - start) > 1) {
            int middleIndex = start + (end - start) / 2;
            if (target < nums[middleIndex]) {
                end = middleIndex;
            } else if (target > nums[middleIndex]){
                start = middleIndex;
            } else {
                return middleIndex;
            }
        }
        return start + 1;
    }


}
