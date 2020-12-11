package com.joejang.algorithm.practice.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZuiXiaoFuGaiZiChuanTest {
    @Test
    public void test001() {
        ZuiXiaoFuGaiZiChuan obj = new ZuiXiaoFuGaiZiChuan();
        String s = "ABC";
        String t = "DEF";
        String res = obj.minWindow(s,t);
        String exp = "";
        Assert.assertEquals(exp,res);
    }

    @Test
    public void test002() {
        ZuiXiaoFuGaiZiChuan obj = new ZuiXiaoFuGaiZiChuan();
        String s = "ABC";
        String t = "AC";
        String res = obj.minWindow(s,t);
        String exp = "ABC";
        Assert.assertEquals(exp,res);
    }

    @Test
    public void test003() {
        ZuiXiaoFuGaiZiChuan obj = new ZuiXiaoFuGaiZiChuan();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = obj.minWindow(s,t);
        String exp = "BANC";
        Assert.assertEquals(exp,res);
    }

    @Test
    public void test004() {
        ZuiXiaoFuGaiZiChuan obj = new ZuiXiaoFuGaiZiChuan();
        String s = "a";
        String t = "a";
        String res = obj.minWindow(s,t);
        String exp = "a";
        Assert.assertEquals(exp,res);
    }
    @Test
    public void test005() {
        ZuiXiaoFuGaiZiChuan obj = new ZuiXiaoFuGaiZiChuan();
        String s = "ABAC";
        String t = "AC";
        String res = obj.minWindow(s,t);
        String exp = "AC";
        Assert.assertEquals(exp,res);
    }
}