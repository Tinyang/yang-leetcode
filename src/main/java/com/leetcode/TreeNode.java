package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 6/29/2022
 */
public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public static TreeNode generateRootNodeByArray(Integer[] array) {
        TreeNode rootNode = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(rootNode);
        TreeNode currentParentNode = null;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 1) {
                currentParentNode = queue.remove();
                if (null != array[i]) {
                    TreeNode currentNode = new TreeNode(array[i]);
                    currentParentNode.left = currentNode;
                    queue.add(currentNode);
                }
            } else {
                if (null != array[i]) {
                    TreeNode currentNode = new TreeNode(array[i]);
                    currentParentNode.right = currentNode;
                    queue.add(currentNode);
                }
            }
        }
        return rootNode;
    }

    public static void main(String[] args) {
        //Node node = generateRootNodeByArray(new Integer[]{1,2,3,null,4,5,6});
        TreeNode node = generateRootNodeByArray(new Integer[]{1,2,3,null,null,5,6});
        //Node node = generateRootNodeByArray(new Integer[]{1,2,3,null,4,5,6});
    }
}
