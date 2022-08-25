package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yangx
 * @Date: 7/5/2022
 */
public class Combinations {

    /*Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].*/
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        if (n < k) {return lists;}
        for (int i = 1; i <= n; i++) {
            lists.add(generateList(i, i + k - 1, n));
        }
        return lists;
    }

    private List<Integer> generateList(int startIndex, int endIndex, int maxIndex) {
        List<Integer> list = new ArrayList<>();
        if (endIndex <= maxIndex) {
            while (startIndex <= endIndex) {
                list.add(startIndex++);
            }
        } else {
            while (startIndex <= maxIndex) {
                list.add(startIndex++);
            }
            int start = 1;
            while (maxIndex + 1 <= endIndex)  {
                maxIndex++;
                list.add(start++);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Combinations().combine(4, 2);
    }
}
