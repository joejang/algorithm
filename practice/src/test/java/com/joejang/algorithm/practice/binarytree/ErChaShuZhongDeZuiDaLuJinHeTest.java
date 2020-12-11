package com.joejang.algorithm.practice.binarytree;

import com.joejang.algorithm.practice.util.BinaryTreeUtil;
import com.joejang.algorithm.practice.util.BinaryTreeUtil.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ErChaShuZhongDeZuiDaLuJinHeTest {
    @Test
    public void test001() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{0};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test005() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1, 2, 3};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 6;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-10, 9, 20, null, null, 15, 7};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 42;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{0};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test008() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, 0, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{2, 0, -1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, -1, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test011() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{3, -1, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test012() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{0, 1, -1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test013() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, 3, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test014() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, -1, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test015() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1, -1, -1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test016() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1, -1, 1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test017() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1, -1, 2};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test018() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, 2, 2};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test019() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{-1, null, 9, -6, 3, null, null, null, -2};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 12;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test020() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{1, -2, -3, 1, 3, -2, null, -1};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test021() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{9, 6, -3, null, null, -6, 2, null, null, 2, null, -6, -6, -6};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 16;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test022() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();
        Integer[] tree = new Integer[]{10, -10, 10, -10, -10, -10, -10};
        TreeNode root = BinaryTreeUtil.arrayToNode(tree);
        int res = obj.maxPathSum(root);
        int exp = 20;
        Assert.assertEquals(exp, res);
    }
}