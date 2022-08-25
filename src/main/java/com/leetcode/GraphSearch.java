package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 6/29/2022
 */
public class GraphSearch {

    public void breadthFirstSearch(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.println(currentNode.val);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public void depthFirstSearchWithRecursive(Node node) {
        if (node == null) {return;}
        System.out.println(node.val); //process work
        depthFirstSearchWithRecursive(node.left);
        depthFirstSearchWithRecursive(node.right);
    }

    public void depthFirstSearch(Node node) {
        Deque<Node> stack = new LinkedList<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            System.out.println(currentNode.val);
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }

    public static void main(String[] args) {
        Node node = Node.generateRootNodeByArray(new Integer[]{1,2,3,4,5,null,6,null,null,7,8});
        new GraphSearch().depthFirstSearch(node);
        System.out.println("=================================");
        new GraphSearch().depthFirstSearchWithRecursive(node);
    }
}
