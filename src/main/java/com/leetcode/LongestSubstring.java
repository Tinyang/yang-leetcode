package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yangx
 * @Date: 6/27/2022
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int maxSubstringLength = 0;
        int windowStart = 0;
        int windowEnd = 0;
        for (int i = 0; i < chars.length; i++) {
            Character c = chars[i];
            if (map.containsKey(c)) {
                int index = map.get(c);
                for (; windowStart <= index; windowStart++) {
                    map.remove(chars[windowStart]);
                }
            }
            map.put(c, i);
            windowEnd ++;
            maxSubstringLength = Math.max((windowEnd - windowStart), maxSubstringLength);
        }
        return maxSubstringLength;
    }

    public boolean checkInclusion(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length > chars2.length) {return false;}
        int[] array = new int[26];
        for (int i = 0; i < chars1.length; i++) {
            array[chars2[i] - 'a'] ++;
            array[chars1[i] - 'a'] --;
        }
        if (isAllZero(array)) {return true;}
        for (int i = chars1.length; i < chars2.length; i++) {
            array[chars2[i] - 'a'] ++;
            array[chars2[i - chars1.length] - 'a'] --;
            if (isAllZero(array)) {return true;}
        }
        return false;
    }

    private boolean isAllZero(int[] array) {
        for (int number: array) {
            if (number != 0) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        new LongestSubstring().lengthOfLongestSubstring(str);
    }
}
