package com.joejang.algorithm.practice.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {
    @Test
    public void test001() {
        Sqrt obj = new Sqrt();
        int x = 8;
        int res = obj.mySqrt(x);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        Sqrt obj = new Sqrt();
        int x = 4;
        int res = obj.mySqrt(x);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        Sqrt obj = new Sqrt();
        int x = 3;
        int res = obj.mySqrt(x);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        Sqrt obj = new Sqrt();
        int x = 2;
        int res = obj.mySqrt(x);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test005() {
        Sqrt obj = new Sqrt();
        int x = 1;
        int res = obj.mySqrt(x);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        Sqrt obj = new Sqrt();
        int x = 0;
        int res = obj.mySqrt(x);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        Sqrt obj = new Sqrt();
        int x = 5;
        int res = obj.mySqrt(x);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test008() {
        Sqrt obj = new Sqrt();
        int x = 6;
        int res = obj.mySqrt(x);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        Sqrt obj = new Sqrt();
        int x = 7;
        int res = obj.mySqrt(x);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        Sqrt obj = new Sqrt();
        int x = 9;
        int res = obj.mySqrt(x);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }
    @Test
    public void test011() {
        Sqrt obj = new Sqrt();
        int x = 10;
        int res = obj.mySqrt(x);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test012() {
        Sqrt obj = new Sqrt();
        int x = 11;
        int res = obj.mySqrt(x);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test013() {
        Sqrt obj = new Sqrt();
        int x = 12;
        int res = obj.mySqrt(x);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test014() {
        Sqrt obj = new Sqrt();
        int x = 13;
        int res = obj.mySqrt(x);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test015() {
        Sqrt obj = new Sqrt();
        int x = 16;
        int res = obj.mySqrt(x);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }
}