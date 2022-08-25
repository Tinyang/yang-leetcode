package com.leetcode;

/**
 * @author: Yangx
 * @Date: 7/5/2022
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        if (n <= 0) {return false;}
        int number = 0;
        for (char currentChar: chars) {
            if (currentChar == '1') {
                number++;
                if (number > 1) {return false;}
            }
        }
        return true;
    }

    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ones++;
            }
            n = n >>> 1;
        }
        return ones;
    }

    /* 0 ^ N = N
    N ^ N = 0 */
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32 ; i++) {
            if ((n & Integer.MIN_VALUE) != 0) {
                result += 1 << i;
            }
            n = n << 1;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-2147483648));
        new IsPowerOfTwo().isPowerOfTwo(-2147483648);

      /*  System.out.println(3 >> 1);
        System.out.println(3 >>> 1);
        System.out.println(-1 >> 1);
        System.out.println(-1 >>> 1);*/
        System.out.println(Integer.MAX_VALUE);
        /*System.out.println(Integer.MIN_VALUE >>> 1);
        System.out.println(Integer.MIN_VALUE >> 1);*/
        System.out.println(123123 & Integer.MIN_VALUE);
        System.out.println(-5 & Integer.MIN_VALUE);
    }
}
