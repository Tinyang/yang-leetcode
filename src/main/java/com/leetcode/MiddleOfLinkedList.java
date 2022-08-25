package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/27/2022
 */
public class MiddleOfLinkedList {


    public ListNode middleNode(ListNode head) {
        ListNode copy = head;
        while (copy != null && copy.next != null) {
            copy = copy.next.next;
            head = head.next;
        }
        return head;
    }

}



