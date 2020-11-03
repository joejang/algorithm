package com.joejang.algorithm.practice.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeUtilTest {
    @Test
    public void test001() {
        Integer[] array = new Integer[]{1, 2, 3};
        BinaryTreeUtil.TreeNode treeNode = BinaryTreeUtil.arrayToNode(array);
        Integer[] res = BinaryTreeUtil.treeNodeToArray(treeNode);
        Assert.assertArrayEquals(array, res);
    }


    @Test
    public void test002() {
        Integer[] array = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        BinaryTreeUtil.TreeNode treeNode = BinaryTreeUtil.arrayToNode(array);
        Integer[] res = BinaryTreeUtil.treeNodeToArray(treeNode);
        Assert.assertArrayEquals(array, res);
    }

    @Test
    public void test003() {
        Integer[] array = new Integer[]{};
        BinaryTreeUtil.TreeNode treeNode = BinaryTreeUtil.arrayToNode(array);
        Integer[] res = BinaryTreeUtil.treeNodeToArray(treeNode);
        Assert.assertArrayEquals(array, res);
    }
}