package com.joejang.algorithm.practice.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchBasicExampleTest {
    @Test
    public void test001() {
        BinarySearchBasicExample obj = new BinarySearchBasicExample();
        int[] nums = new int[]{1, 5, 9, 10, 13, 20, 26};
        int target = 13;
        int res = obj.search(nums, target);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        BinarySearchBasicExample obj = new BinarySearchBasicExample();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int res = obj.search(nums, target);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        BinarySearchBasicExample obj = new BinarySearchBasicExample();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int res = obj.search(nums, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

}