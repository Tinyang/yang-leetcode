package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/27/2022
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode convertArrayToListNode(int[] array) {
        ListNode head = new ListNode(array[0]);
        ListNode copy = head;
        for (int i = 1; i < array.length; i++) {
            copy.next = new ListNode(array[i]);
            copy = copy.next;
        }
        return head;
    }

}
