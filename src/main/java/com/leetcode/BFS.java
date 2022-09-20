package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    /*For Inorder, you traverse from the left subtree to the root then to the right subtree.
    For Preorder, you traverse from the root to the left subtree then to the right subtree.
    For Post order, you traverse from the left subtree to the right subtree then to the root.*/

    public static void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.val);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.generateRootNodeByArray(new Integer[]{1,2,3,null,null,4,null,5,6});
        BFS(node);
    }

}
