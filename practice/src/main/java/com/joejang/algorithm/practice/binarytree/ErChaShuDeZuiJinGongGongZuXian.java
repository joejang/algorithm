package com.joejang.algorithm.practice.binarytree;

import java.util.*;

import com.joejang.algorithm.practice.util.BinaryTreeUtil.TreeNode;

public class ErChaShuDeZuiJinGongGongZuXian {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    // old:
//    private boolean found = false;
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        HashSet<Integer> set = new HashSet<>();
//        List<Integer> list = new LinkedList<>();
//        visit(root, p, set);
//        found = false;
//        visit(root, q, list);
//        for (int i = 0; i < list.size(); i++) {
//            if (set.contains(list.get(i))) {
//                return new TreeNode(list.get(i));
//            }
//        }
//        return null;
//    }
//
//
//    private void visit(TreeNode root, TreeNode find, Collection<Integer> collection) {
//        if (root == null) {
//            return;
//        }
//        if (root.val == find.val) {
//            found = true;
//            collection.add(root.val);
//            return;
//        }
//        visit(root.left, find, collection);
//        if (found) {
//            collection.add(root.val);
//            return;
//        }
//        visit(root.right, find, collection);
//        if (found) {
//            collection.add(root.val);
//            return;
//        }
//    }
}
