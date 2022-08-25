package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: Yangx
 * @Date: 7/5/2022
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode sentinelNode = new ListNode(0);
        ListNode copy = sentinelNode;
        while (!stack.isEmpty()) {
            sentinelNode.next = stack.pop();
            sentinelNode = sentinelNode.next;
        }
        sentinelNode.next = null;
        return copy.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.convertArrayToListNode(new int[]{1,2,3,4,5});
        new ReverseLinkedList().reverseList(head);
    }


}
