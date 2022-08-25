package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yangx
 * @Date: 6/26/2022
 */
public class TwoSum {

    /*Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int number = numbers[i];
            for (int j = i + 1; j < numbers.length ; j++) {
                if ((target - numbers[j]) == number) {
                    array[0] = i + 1;
                    array[1] = j + 1;
                    return array;
                }
            }
        }
        return array;
    }

    public int[] twoSumWithHashMap(int[] numbers, int target) {
        int smallIndex = 0;
        int bigIndex = numbers.length - 1;
        while ((numbers[smallIndex] + numbers[bigIndex]) != target) {
            if ((numbers[smallIndex] + numbers[bigIndex]) > target) {
                bigIndex--;
            } else {
                smallIndex++;
            }
        }
        return new int[]{++smallIndex, ++bigIndex};
    }
}
