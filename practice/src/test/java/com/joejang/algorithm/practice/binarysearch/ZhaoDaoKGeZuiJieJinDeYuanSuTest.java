package com.joejang.algorithm.practice.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ZhaoDaoKGeZuiJieJinDeYuanSuTest {
    @Test
    public void test001() {
        ZhaoDaoKGeZuiJieJinDeYuanSu obj = new ZhaoDaoKGeZuiJieJinDeYuanSu();
        int[] arr = new int[]{1, 2, 3};
        int target = 2;
        int res = obj.bs(arr, target);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        ZhaoDaoKGeZuiJieJinDeYuanSu obj = new ZhaoDaoKGeZuiJieJinDeYuanSu();
        int[] arr = new int[]{1, 8};
        int target = 5;
        int res = obj.bs(arr, target);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        ZhaoDaoKGeZuiJieJinDeYuanSu obj = new ZhaoDaoKGeZuiJieJinDeYuanSu();
        int[] arr = new int[]{1, 9};
        int target = 5;
        int res = obj.bs(arr, target);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

}