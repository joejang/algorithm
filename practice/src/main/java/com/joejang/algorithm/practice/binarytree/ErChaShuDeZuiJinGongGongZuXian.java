package com.joejang.algorithm.practice.binarytree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ErChaShuDeZuiJinGongGongZuXian {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        visit(root, p);
        found = false;
        visitToList(root, q);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (set.contains(list.get(i))) {
                return new TreeNode(list.get(i));
            }
        }
        return null;
    }

    private Set<Integer> set = new HashSet<>();
    private List<Integer> list = new LinkedList<>();
    private boolean found = false;

    private void visit(TreeNode root, TreeNode find) {
        if (root == null) {
            return;
        }
        if (root.val == find.val) {
            found = true;
            set.add(root.val);
            return;
        }
        visit(root.left, find);
        visit(root.right, find);
    }

    private void visitToList(TreeNode root, TreeNode find) {
        if (root == null) {
            return;
        }
        if (found) {
            set.add(root.val);
            return;
        }
        if (root.val == find.val) {
            found = true;
            set.add(root.val);
            return;
        }
        visit(root.left, find);
        visit(root.right, find);
    }
}
