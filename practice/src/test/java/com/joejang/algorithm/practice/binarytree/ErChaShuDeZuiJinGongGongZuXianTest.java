package com.joejang.algorithm.practice.binarytree;

import com.joejang.algorithm.practice.util.BinaryTreeUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ErChaShuDeZuiJinGongGongZuXianTest {
    @Test
    public void test001() {
        ErChaShuDeZuiJinGongGongZuXian obj = new ErChaShuDeZuiJinGongGongZuXian();

        BinaryTreeUtil.TreeNode root = BinaryTreeUtil.arrayToNode(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        BinaryTreeUtil.TreeNode p = new BinaryTreeUtil.TreeNode(5);
        BinaryTreeUtil.TreeNode q = new BinaryTreeUtil.TreeNode(1);
        BinaryTreeUtil.TreeNode res = obj.lowestCommonAncestor(root, p, q);
        BinaryTreeUtil.TreeNode exp = BinaryTreeUtil.arrayToNode(new Integer[]{3});
        Assert.assertEquals(exp.val, res.val);
    }

    @Test
    public void test002() {
        ErChaShuDeZuiJinGongGongZuXian obj = new ErChaShuDeZuiJinGongGongZuXian();

        BinaryTreeUtil.TreeNode root = BinaryTreeUtil.arrayToNode(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, null, null, null, 10});
        BinaryTreeUtil.TreeNode p = new BinaryTreeUtil.TreeNode(10);
        BinaryTreeUtil.TreeNode q = new BinaryTreeUtil.TreeNode(6);
        BinaryTreeUtil.TreeNode res = obj.lowestCommonAncestor(root, p, q);
        BinaryTreeUtil.TreeNode exp = BinaryTreeUtil.arrayToNode(new Integer[]{3});
        Assert.assertEquals(exp.val, res.val);
    }

}