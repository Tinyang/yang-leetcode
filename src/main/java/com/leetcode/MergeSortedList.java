package com.leetcode;


/**
 * @author: Yangx
 * @Date: 7/4/2022
 */
public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) {return list1;}
        if (list1 == null) {return list2;}
        ListNode sentinelHead = new ListNode(0);
        ListNode copy = sentinelHead;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    sentinelHead.next = list1;
                    list1 = list1.next;
                } else {
                    sentinelHead.next = list2;
                    list2 = list2.next;
                }
                sentinelHead = sentinelHead.next;
            } else if (list1 == null && list2 != null) {
                sentinelHead.next = list2;
                break;
            } else {
                sentinelHead.next = list1;
                break;
            }
        }
        return copy.next;
    }

    public ListNode mergeTwoListsByRecursive(ListNode list1, ListNode list2) {
        if (list2 == null) {return list1;}
        if (list1 == null) {return list2;}
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
