package com.joejang.algorithm.practice.util;

import com.joejang.algorithm.practice.binarytree.ErChaShuDeZuiJinGongGongZuXian;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class BinaryTreeUtil {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode arrayToNode(Integer[] array) {
        if (array.length == 0 || array[0] == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(array[0]);
        queue.add(root);

        int currIndex = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr != null) {
                    TreeNode left = null;
                    if (2 * currIndex + 1 < array.length) {
                        if (array[2 * currIndex + 1] != null) {
                            left = new TreeNode(array[2 * currIndex + 1]);
                        }
                    }
                    queue.add(left);
                    TreeNode right = null;
                    if (2 * currIndex + 2 < array.length) {
                        if (array[2 * currIndex + 2] != null) {
                            right = new TreeNode(array[2 * currIndex + 2]);
                        }
                    }
                    queue.add(right);
                    curr.left = left;
                    curr.right = right;
                }
                currIndex++;
            }
        }
        return root;
    }

    public static Integer[] treeNodeToArray(TreeNode treeNode) {
        List<Integer> res = new LinkedList<>();
        if (treeNode == null) {
            return res.toArray(new Integer[0]);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    res.add(poll.val);
                    queue.add(poll.left);
                    queue.add(poll.right);
                } else {
                    res.add(null);
                }
            }
        }
        int i = res.size() - 1;
        for (; i >= 0; i--) {
            if (res.get(i) != null) {
                break;
            }
        }
        return res.subList(0, i + 1).toArray(new Integer[0]);
    }
}
