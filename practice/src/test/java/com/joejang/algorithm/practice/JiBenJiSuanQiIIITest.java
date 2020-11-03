package com.joejang.algorithm.practice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JiBenJiSuanQiIIITest {
    @Test
    public void test001() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "MAX((1)+1,0)";
        int res = obj.calculate(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "MAX((1)+1+1,2) + 1";
        int res = obj.calculate(s);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "1";
        int res = obj.calculate(s);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "1+1";
        int res = obj.calculate(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }
    @Test
    public void test005() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "1+2/2";
        int res = obj.calculate(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "3+9/3-5/5";
        int res = obj.calculate(s);
        int exp = 5;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "0-2147483648";
        int res = obj.calculate(s);
        int exp = -2147483648;
        Assert.assertEquals(exp, res);

    }
}