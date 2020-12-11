package com.joejang.algorithm.practice.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WuChongFuZiFuDeZuiChangZiChuanTest {
    @Test
    public void test001() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "abcdefg";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 7;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "aab";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "aaaa";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test005() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "a";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "aa";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "ab";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test008() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "aba";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test009() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "ababab";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test010() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "ababaa";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 2;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test011() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "abcaa";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test012() {
        WuChongFuZiFuDeZuiChangZiChuan obj = new WuChongFuZiFuDeZuiChangZiChuan();
        String s = "abcabaa";
        int res = obj.lengthOfLongestSubstring(s);
        int exp = 3;
        Assert.assertEquals(exp, res);
    }
}