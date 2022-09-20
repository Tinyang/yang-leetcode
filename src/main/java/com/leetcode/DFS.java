package com.leetcode;

import java.util.Stack;

public class DFS {


    /*For Inorder, you traverse from the left subtree to the root then to the right subtree.
    For Preorder, you traverse from the root to the left subtree then to the right subtree.
    For Post order, you traverse from the left subtree to the right subtree then to the root.*/

    public static void preorderDFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.right;
        }
    }

    public static void inorderDFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                System.out.print(currentNode.val + " ");
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            currentNode = currentNode.right;
        }
    }

    public static void postorderDFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            currentNode = currentNode.right;
        }
    }


    public static void preorderDFSWithRecursive(TreeNode root) {
        if (root != null) {
            preorderDFSWithRecursive(root.left);
            System.out.print(root.val + " ");
            preorderDFSWithRecursive(root.right);
        }
    }

    public static void inorderDFSWithRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            inorderDFSWithRecursive(root.left);
            inorderDFSWithRecursive(root.right);
        }
    }

    public static void postorderDFSWithRecursive(TreeNode root) {
        if (root != null) {
            postorderDFSWithRecursive(root.left);
            postorderDFSWithRecursive(root.right);
            System.out.print(root.val + " ");
        }
    }


    public static void main(String[] args) {
        TreeNode root = TreeNode.generateRootNodeByArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
  /*      preorderDFS(root);
        System.out.println("");
        System.out.print("preorder:");
        preorderDFSWithRecursive(root);
        System.out.println("");*/
        System.out.print("inorder:");
        inorderDFS(root);
        System.out.println("");
        inorderDFSWithRecursive(root);
        System.out.println("");
        /*System.out.print("postorder:");
        postorderDFSWithRecursive(root);*/
    }
}
