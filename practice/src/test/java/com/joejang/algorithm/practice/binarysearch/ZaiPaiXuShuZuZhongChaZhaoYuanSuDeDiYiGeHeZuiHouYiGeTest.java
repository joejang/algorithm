package com.joejang.algorithm.practice.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGeTest {
    @Test
    public void test001() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1, 1, 1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{0, 2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test002() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1, 2, 3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1, 1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test003() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1, 1, 2};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{0, 1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test004() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0, 1, 1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1, 2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test005() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1, 2, 2, 3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1, 2};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test006() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1, 1,2,2,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2, 4};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test007() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,2,3,3};
        int target = 3;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{4, 5};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test008() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,1,2,2,3,3};
        int target = 3;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{5, 6};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test009() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test010() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,0,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test011() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test012() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,1,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,3};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test013() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,1,1,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,4};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test014() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,0,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test015() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,0,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,3};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test016() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,0,1,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,4};
        Assert.assertArrayEquals(exp, res);
    }


    @Test
    public void test017() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{0,0,1,1,1,1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,5};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test018() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2};
        int target = 0;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{-1,-1};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test019() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,3};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{0,0};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test020() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{-1,-1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test021() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,3};
        int target = 3;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test022() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,3};
        int target = 4;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{-1,-1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test023() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1};
        int target = 0;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{-1,-1};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test024() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1};
        int target = 1;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{0,0};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test025() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{-1,-1};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test026() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,1};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test027() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2,2,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test028() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2,2,2,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,3};
        Assert.assertArrayEquals(exp, res);
    }


    @Test
    public void test029() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2,2,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,3};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test030() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,2,2,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,4};
        Assert.assertArrayEquals(exp, res);
    }


    @Test
    public void test031() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,2,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,4};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test032() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,2,2,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,5};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test033() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,2,2,2,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{1,4};
        Assert.assertArrayEquals(exp, res);
    }
    @Test
    public void test034() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,2,2,2,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,5};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test035() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,3,3};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,2};
        Assert.assertArrayEquals(exp, res);
    }


    @Test
    public void test036() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,3,3,4};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test037() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,2,3,3,4,4};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{2,2};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test038() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,1,2,3,3,4,4};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{3,3};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void test039() {
        ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe obj = new ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe();
        int[] nums = new int[]{1,1,1,2,3,3,4};
        int target = 2;
        int[] res = obj.searchRange(nums, target);
        int[] exp = new int[]{3,3};
        Assert.assertArrayEquals(exp, res);
    }
}