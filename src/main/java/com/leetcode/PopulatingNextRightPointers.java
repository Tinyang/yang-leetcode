package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 7/3/2022
 */
public class PopulatingNextRightPointers {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        int index = 1;
        int count = 0;
        int level = 1;
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
            count ++;
            if (count == index) {
                node.next = null;
                level++;
                index = setNewIndex(level);
            } else {
                node.next = queue.peek();
            }
        }
        return root;
    }
    private int setNewIndex(int level) {
        int index =  1;
        while (level > 0) {
            index *= 2;
            level--;
        }
        return index - 1;
    }

    public static void main(String[] args) {
        Node node = Node.generateRootNodeByArray(new Integer[]{1,2,3,4,5,6,7});
        new PopulatingNextRightPointers().connect(node);
    }

}
