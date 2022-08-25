package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Yangx
 * @Date: 6/30/2022
 */
public class MergeTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root2 == null && root1 != null) {
            return root1;
        }
        if (root1 == null && root2 == null) {
            return null;
        }
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.add(new TreeNode[]{root1, root2});
        while (!queue.isEmpty()) {
            TreeNode[] treeNodes = queue.remove();
            if (treeNodes[1] == null) {
                continue;
            }
            //treeNodes[0] can't be null when treeNodes[1] is not null
            treeNodes[0].val += treeNodes[1].val;
            if (treeNodes[0].left == null) {
                treeNodes[0].left = treeNodes[1].left;
            } else {
                queue.add(new TreeNode[]{treeNodes[0].left, treeNodes[1].left});
            }
            if (treeNodes[0].right == null) {
                treeNodes[0].right = treeNodes[1].right;
            } else {
                queue.add(new TreeNode[]{treeNodes[0].right, treeNodes[1].right});
            }
        }
    return root1;
    }

    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root2 == null && root1 != null) {
            return root1;
        }
        if (root1 == null && root2 == null) {
            return null;
        }
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees2(root1.left, root2.left);
        root1.right = mergeTrees2(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = TreeNode.generateRootNodeByArray(new Integer[]{1,3,2,5});
        TreeNode treeNode2 = TreeNode.generateRootNodeByArray(new Integer[]{2,1,3,null,4,null,7});
        new MergeTrees().mergeTrees(treeNode1, treeNode2);
    }


}
