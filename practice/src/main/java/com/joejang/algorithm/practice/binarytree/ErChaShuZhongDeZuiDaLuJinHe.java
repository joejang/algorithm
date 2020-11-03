package com.joejang.algorithm.practice.binarytree;

public class ErChaShuZhongDeZuiDaLuJinHe {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int outterResult = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        return visitReturnMax(root);
    }

    private int visitReturnMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = visitReturnMax(root.left);
        int rightVal = visitReturnMax(root.right);
        int max = Math.max(leftVal + root.val, rightVal + root.val);
        int tmp = Math.max(max, leftVal + rightVal + root.val);
        outterResult = Math.max(tmp, outterResult);
        return max;
    }
}
