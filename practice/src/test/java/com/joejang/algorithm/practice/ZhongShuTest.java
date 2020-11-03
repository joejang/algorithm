package com.joejang.algorithm.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZhongShuTest {

    @Test
    public void test001() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{1, 2, 8, 4, 9};
        int k = 3;
        int res = obj.largestMinDist(arr, k);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{1, 2, 7, 5, 11, 12};
        int k = 3;
        int res = obj.largestMinDist(arr, k);
        int exp = 5;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{1, 2, 3,4,5, 10};
        int k = 3;
        int res = obj.largestMinDist(arr, k);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{0, 2};
        int k = 2;
        int res = obj.largestMinDist(arr, k);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test005() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{1, 3};
        int k = 2;
        int res = obj.largestMinDist(arr, k);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test005_1() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{0, 3};
        int k = 2;
        int res = obj.largestMinDist(arr, k);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test006() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{8, 9};
        int k = 2;
        int res = obj.largestMinDist(arr, k);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        ZhongShu obj = new ZhongShu();
        int[] arr = new int[]{5, 7};
        int k = 2;
        int res = obj.largestMinDist(arr, k);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }
}