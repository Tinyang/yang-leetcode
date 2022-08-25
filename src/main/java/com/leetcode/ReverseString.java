package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/26/2022
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
         char temp = s[start];
         s[start++] = s[end];
         s[end--] = temp;
        }
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (String str: strings) {
            char[] chars = str.toCharArray();
            reverseString(chars);
            sb.append(new String(chars) + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseWords("Let's take LeetCode contest"));
    }

}
