package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/23/2022
 */
public class FirstBadVersion {
    //n stands for the total numbers of version
    public int firstBadVersionRecursive(int n) {
        return findBadVersion(1, n);
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start != end - 1 && start != end) {
            int middleIndex = start + (end - start) / 2;
            if (isBadVersion(middleIndex)) {
                end = middleIndex;
            } else {
                start = middleIndex;
            }
        }
        if (start == end - 1 || start == end) {
            if (isBadVersion(start)) { return start;}
            else if (isBadVersion(end)) {
                return end;
            }
        }
        return -1;
    }



    private int findBadVersion(int start, int end) {
        if (start == end - 1 || start == end) {
            if (isBadVersion(start)) { return start;}
            else if (isBadVersion(end)) {
                return end;
            } else {
                return -1;
            }
        }
        int middleIndex = start + (end - start) / 2;
        if (isBadVersion(middleIndex)) {
            return findBadVersion(start, middleIndex);
        } else {
            return findBadVersion(middleIndex, end);
        }
    }

    private boolean isBadVersion(int n) {
        if (n >= 1702766719) {return true;}
        //if (n >= 4) {return true;}
        return false;
    }

    public static void main(String[] args) {
        new FirstBadVersion().firstBadVersionRecursive(2126753390);
    }
}
