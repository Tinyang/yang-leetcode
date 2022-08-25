package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/23/2022
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return findTarget(nums, 0, nums.length - 1, target);
    }

    private int findTarget(int[] nums, int start, int end, int target) {
        if (target < nums[start] || target > nums[end]) {return -1;}
        int index = (end + start) / 2;
        if (start < index && index < end) {
            if (nums[index] < target) {
                return findTarget(nums, index, end, target);
            } else if (nums[index] > target){
                return findTarget(nums, start, index, target);
            } else {
                return index;
            }
        } else {
            if (nums[start] == target) {return start;}
            if (nums[end] == target) {return end;}
            return -1;
        }
    }

    public int searchNoRecursive(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while ((end - start) > 1) {
            int middle = start + (end - start) / 2;
            if (nums[middle] < target) {
                start = middle;
            } else if (nums[middle] > target) {
                end = middle;
            } else {
                return middle;
            }
        }
        if (nums[start] == target) {return start;}
        if (nums[end] == target) {return end;}
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(5 / 2);
        int[] array = {1, 2, 3};
        System.out.println(array.length);
        //new int[]{2,5};
        //5
    }
}
