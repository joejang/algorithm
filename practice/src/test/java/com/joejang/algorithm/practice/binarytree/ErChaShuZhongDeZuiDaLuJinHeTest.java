package com.joejang.algorithm.practice.binarytree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ErChaShuZhongDeZuiDaLuJinHeTest {
    @Test
    public void test001() {
        ErChaShuZhongDeZuiDaLuJinHe obj = new ErChaShuZhongDeZuiDaLuJinHe();

        ErChaShuZhongDeZuiDaLuJinHe.TreeNode root = new ErChaShuZhongDeZuiDaLuJinHe.TreeNode();
        int res = obj.maxPathSum(root);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

}