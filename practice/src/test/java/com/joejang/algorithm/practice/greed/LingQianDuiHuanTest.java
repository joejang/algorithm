package com.joejang.algorithm.practice.greed;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LingQianDuiHuanTest {
    @Test
    public void test001() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1};
        int amount = 0;
        int res = obj.coinChange(coins, amount);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{2};
        int amount = 3;
        int res = obj.coinChange(coins, amount);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1};
        int amount = 0;
        int res = obj.coinChange(coins, amount);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test005() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1};
        int amount = 1;
        int res = obj.coinChange(coins, amount);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1};
        int amount = 2;
        int res = obj.coinChange(coins, amount);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3};
        int amount = 2;
        int res = obj.coinChange(coins, amount);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test008() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,7,10};
        int amount = 34;
        int res = obj.coinChange(coins, amount);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,10,100};
        int amount = 100;
        int res = obj.coinChange(coins, amount);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,10,100};
        int amount = 1;
        int res = obj.coinChange(coins, amount);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test011() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,10,100};
        int amount = 10;
        int res = obj.coinChange(coins, amount);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test012() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 13;
        int res = obj.coinChange(coins, amount);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test013() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 30;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test014() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 31;
        int res = obj.coinChange(coins, amount);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test015() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 32;
        int res = obj.coinChange(coins, amount);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test016() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 35;
        int res = obj.coinChange(coins, amount);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test017() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 36;
        int res = obj.coinChange(coins, amount);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test018() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10};
        int amount = 25;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test019() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{1,2,3,4,5,6,7,8,9,10,12,13};
        int amount = 10000;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test020() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{3,6,9,12,15,18,21,24,27,30,99,35};
        int amount = 10000;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test021() {
        LingQianDuiHuan obj = new LingQianDuiHuan();
        int[] coins = new int[]{342,268,284,65,217,461,245,249,106};
        int amount = 9278;
        int res = obj.coinChange(coins, amount);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }
}