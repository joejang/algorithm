package com.joejang.algorithm.practice.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SouSuoLuoXuanPaiXuShuZuTest {
    @Test
    public void test001() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int res = obj.search(nums, target);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{3,1};
        int target = 3;
        int res = obj.search(nums, target);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{3,1};
        int target = 1;
        int res = obj.search(nums, target);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }


    @Test
    public void test005() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{5,6,1,2};
        int target = 1;
        int res = obj.search(nums, target);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 1;
        int res = obj.search(nums, target);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{5,6,1,2};
        int target = 5;
        int res = obj.search(nums, target);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test008() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{5,6,1,2};
        int target = 2;
        int res = obj.search(nums, target);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 7;
        int res = obj.search(nums, target);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 11;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test011() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 0;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test012() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 4;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test013() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 6;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test014() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 8;
        int res = obj.search(nums, target);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test015() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 2;
        int res = obj.search(nums, target);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test016() {
        SouSuoLuoXuanPaiXuShuZu obj = new SouSuoLuoXuanPaiXuShuZu();
        int[] nums = new int[]{7,8,1,2,3};
        int target = 3;
        int res = obj.search(nums, target);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }
}