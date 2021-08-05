package com.demo.geek.c7_recursion;

public class LeetCode111 { // LeetCode 111

    /**
     * 二叉树的最小深度
     * 给定一个二叉树，找出其最小深度。
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * 说明: 叶子节点是指没有子节点的节点。
     * <p>
     * 示例:
     * 给定二叉树 [3,9,20,null,null,15,7],
     *      3
     *     / \
     *    9  20
     *  /  \
     * 15   7
     * 返回它的最小深度  2.
     */

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    public static int minDepth(TreeNode root) { // 1.递归
        if (root == null) {
            return 0;
        }
        if ((root.left == null) && (root.right == null)) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(min_depth, minDepth(root.left));
        }
        if (root.right != null) {
            min_depth = Math.min(min_depth, minDepth(root.right));
        }

        return min_depth + 1;
    }

    public static int minDepth2(TreeNode root) { // 1.递归
        if (root == null) {
            return 0;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        return l > r ? l : r + 1;
    }

    public static int minDepth02(TreeNode root) { // 2.迭代
        int count = 0;
        TreeNode cur = root;

        return 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(100);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(22);
        root.left.right = new TreeNode(32);

        System.out.println("minDepth: " + minDepth(root));
        System.out.println("minDepth2: " + minDepth2(root));
    }


}