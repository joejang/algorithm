package com.joejang.algorithm.practice.dp;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LingQianDuiHuanTest extends TestCase {
    @Test
    public void test001() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 3;
        int res = obj.coinChange(new int[]{1, 2, 5}, 11);
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test002() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 11;
        int res = obj.coinChange(new int[]{1}, 11);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 1;
        int res = obj.coinChange(new int[]{1}, 1);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 3;
        int res = obj.coinChange(new int[]{2, 1}, 5);
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test005() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 1;
        int res = obj.coinChange(new int[]{1, 2, 3, 4, 5}, 5);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 2;
        int res = obj.coinChange(new int[]{1, 5}, 10);
        Assert.assertEquals(exp, res);
    }



    @Test
    public void test007() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 3;
        int res = obj.coinChange(new int[]{1, 2,5}, 8);
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test008() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 1;
        int res = obj.coinChange(new int[]{1, 2,5}, 1);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 3;
        int res = obj.coinChange(new int[]{1,2}, 6);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 2;
        int res = obj.coinChange(new int[]{1,2}, 3);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test011() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 1;
        int res = obj.coinChange(new int[]{1,2}, 2);
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test012() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = -1;
        int res = obj.coinChange(new int[]{2}, 1);
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test013() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = -1;
        int res = obj.coinChange(new int[]{2}, 3);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test014() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int exp = 20;
        int res = obj.coinChange(new int[]{186,419,83,408}, 6249);
        Assert.assertEquals(exp, res);
    }
}