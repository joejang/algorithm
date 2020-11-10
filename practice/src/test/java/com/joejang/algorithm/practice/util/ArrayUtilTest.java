package com.joejang.algorithm.practice.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayUtilTest {
    @Test
    public void test001() {
        int[][] array = new int[][]{
                {}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {}
        };
        Assert.assertTrue(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test002() {
        int[][] array = new int[][]{
                {1}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1}
        };
        Assert.assertTrue(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test003() {
        int[][] array = new int[][]{
                {1}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {2}
        };
        Assert.assertFalse(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test004() {
        int[][] array = new int[][]{
                {1}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1, 2}
        };
        Assert.assertFalse(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test005() {
        int[][] array = new int[][]{
                {1, 2}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1}
        };
        Assert.assertFalse(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test006() {
        int[][] array = new int[][]{
                {1, 2}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1, 2}
        };
        Assert.assertTrue(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test007() {
        int[][] array = new int[][]{
                {}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1, 2}
        };
        Assert.assertFalse(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test008() {
        int[][] array = new int[][]{

        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {}
        };
        Assert.assertFalse(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test009() {
        int[][] array = new int[][]{

        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{

        };
        Assert.assertTrue(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test010() {
        int[][] array = new int[][]{
                {1, 2, 3}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        int[][] res = ArrayUtil.listToArray(list);
        int[][] exp = new int[][]{
                {1, 2, 3}
        };
        Assert.assertTrue(ArrayUtil.arrayEquals(exp, res));
    }

    @Test
    public void test011() {
        int[][] array = new int[][]{
                {1, 2, 3}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        Assert.assertTrue(ArrayUtil.listEquals(list, list));
    }

    @Test
    public void test012() {
        int[][] array = new int[][]{
                {}
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        Assert.assertTrue(ArrayUtil.listEquals(list, list));
    }

    @Test
    public void test012_more() {
        int[][] array = new int[][]{
                {}
        };
        Assert.assertTrue(ArrayUtil.arrayEquals(array, array));
    }

    @Test
    public void test013() {
        int[][] array = new int[][]{
        };
        List<List<Integer>> list = ArrayUtil.arrayToList(array);
        Assert.assertTrue(ArrayUtil.listEquals(list, list));
    }

    @Test
    public void test014() {
        int[][] array0 = new int[][]{
                {1, 2, 3}
        };
        int[][] array1 = new int[][]{

        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test015() {
        int[][] array0 = new int[][]{
                {1, 2, 3}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test016() {
        int[][] array0 = new int[][]{
                {1, 2, 3}
        };
        int[][] array1 = new int[][]{
                {1, 2}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test017() {
        int[][] array0 = new int[][]{
                {1, 2, 3}
        };
        int[][] array1 = new int[][]{
                {1, 2, 3, 4}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test018() {
        int[][] array0 = new int[][]{
                {1, 2, 3}
        };
        int[][] array1 = new int[][]{
                {1, 2, 4}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test019() {
        int[][] array0 = new int[][]{
                {1}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test020() {
        int[][] array0 = new int[][]{
                {1}
        };
        int[][] array1 = new int[][]{

        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test021() {
        int[][] array0 = new int[][]{
                {1, 2}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test022() {
        int[][] array0 = new int[][]{
                {1}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test023() {
        int[][] array0 = new int[][]{
                {1}
        };
        int[][] array1 = new int[][]{
                {1}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertTrue(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test024() {
        int[][] array0 = new int[][]{

        };
        int[][] array1 = new int[][]{
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertTrue(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test025() {
        int[][] array0 = new int[][]{
                {}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertTrue(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test026() {
        int[][] array0 = new int[][]{
                {},
                {}
        };
        int[][] array1 = new int[][]{
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }

    @Test
    public void test027() {
        int[][] array0 = new int[][]{
                {},
                {}
        };
        int[][] array1 = new int[][]{
                {},
                {}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertTrue(ArrayUtil.listEquals(list0, list1));
    }
    @Test
    public void test028() {
        int[][] array0 = new int[][]{
                {},{1},{1,2},{1,2,3},{}
        };
        int[][] array1 = new int[][]{
                {},{1},{1,2},{1,2,3},{}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertTrue(ArrayUtil.listEquals(list0, list1));
    }
    @Test
    public void test029() {
        int[][] array0 = new int[][]{
                {},{1},{1,2},{1,2,3},{}
        };
        int[][] array1 = new int[][]{
                {},{1},{1,2},{1,2,3}
        };
        List<List<Integer>> list0 = ArrayUtil.arrayToList(array0);
        List<List<Integer>> list1 = ArrayUtil.arrayToList(array1);
        Assert.assertFalse(ArrayUtil.listEquals(list0, list1));
    }
}