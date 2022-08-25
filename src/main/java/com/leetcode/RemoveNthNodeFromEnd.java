package com.leetcode;

/**
 * @author: Yangx
 * @Date: 6/27/2022
 */
public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPointer = head;
        ListNode quickPointer = head;
        while (quickPointer != null) {
            quickPointer = quickPointer.next;
            if (n >= 0) {
                n--;
            } else {
                slowPointer = slowPointer.next;
            }
        }
        if (n == -1) {
            slowPointer.next = slowPointer.next.next;
        } else if (slowPointer.next == null) {
            return null;
        } else {
            return slowPointer.next;
        }
        return head;
    }

    public static void main(String[] args) {
        //ListNode head = ListNode.convertArrayToListNode(new int[]{1,2,3,4,5});
        //new RemoveNthNodeFromEnd().removeNthFromEnd(head, 2);
        //ListNode head = ListNode.convertArrayToListNode(new int[]{1});
        //new RemoveNthNodeFromEnd().removeNthFromEnd(head, 1);

        ListNode head = ListNode.convertArrayToListNode(new int[]{1,2});
        new RemoveNthNodeFromEnd().removeNthFromEnd(head, 2);
    }
}
