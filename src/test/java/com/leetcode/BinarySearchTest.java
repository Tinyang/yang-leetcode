package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: Yangx
 * @Date: 6/23/2022
 */
public class BinarySearchTest {

    private  BinarySearch binarySearch = new BinarySearch();
    @Test
    public void testSearch() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Assert.assertEquals(4, binarySearch.search(nums, target));
        target = 2;
        Assert.assertEquals(-1, binarySearch.search(nums, target));
        target = 5;
        nums = new int[]{2,5};
        Assert.assertEquals(1, binarySearch.search(nums, target));
    }

    @Test
    public void testSearchNoRecursive() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Assert.assertEquals(4, binarySearch.searchNoRecursive(nums, target));
        target = 2;
        Assert.assertEquals(-1, binarySearch.searchNoRecursive(nums, target));
        target = 5;
        nums = new int[]{2,5};
        Assert.assertEquals(1, binarySearch.searchNoRecursive(nums, target));
    }
}
