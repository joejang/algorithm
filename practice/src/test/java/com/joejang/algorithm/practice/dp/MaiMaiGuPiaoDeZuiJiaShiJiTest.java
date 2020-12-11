package com.joejang.algorithm.practice.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaiMaiGuPiaoDeZuiJiaShiJiTest {
    @Test
    public void test001() {
        MaiMaiGuPiaoDeZuiJiaShiJi obj = new MaiMaiGuPiaoDeZuiJiaShiJi();
        int[] prices = new int[]{2, 4, 1};
        int k = 2;
        int res = obj.maxProfit(k, prices);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        MaiMaiGuPiaoDeZuiJiaShiJi obj = new MaiMaiGuPiaoDeZuiJiaShiJi();
        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        int k = 2;
        int res = obj.maxProfit(k, prices);
        int exp = 7;
        Assert.assertEquals(exp, res);
    }
}