package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 6/29/2022
 */
public class Node {

    int val;

    Node left;

    Node right;

    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public static Node generateRootNodeByArray(Integer[] array) {
        Node rootNode = new Node(array[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        Node currentParentNode = null;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 1) {
                currentParentNode = queue.remove();
                if (null != array[i]) {
                    Node currentNode = new Node(array[i]);
                    currentParentNode.left = currentNode;
                    queue.add(currentNode);
                }
            } else {
                if (null != array[i]) {
                    Node currentNode = new Node(array[i]);
                    currentParentNode.right = currentNode;
                    queue.add(currentNode);
                }
            }
        }
        return rootNode;
    }

    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a + 3;
        //Node node = generateRootNodeByArray(new Integer[]{1,2,3,null,4,5,6});
        //Node node = generateRootNodeByArray(new Integer[]{1,2,3,null,null,5,6});
        //Node node = generateRootNodeByArray(new Integer[]{1,2,3,null,4,5,6});
    }
}
