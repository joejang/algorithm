package com.joejang.algorithm.practice.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZiFuChuanDePaiLieTest {

    @Test
    public void test001() {
        ZiFuChuanDePaiLie obj = new ZiFuChuanDePaiLie();
        String s1 = "a";
        String s2 = "a";
        boolean res = obj.checkInclusion(s1,s2);
        boolean exp = true;
        Assert.assertEquals(exp,res);
    }

    @Test
    public void test002() {
        ZiFuChuanDePaiLie obj = new ZiFuChuanDePaiLie();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res = obj.checkInclusion(s1,s2);
        boolean exp = true;
        Assert.assertEquals(exp,res);
    }

    @Test
    public void test003() {
        ZiFuChuanDePaiLie obj = new ZiFuChuanDePaiLie();
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean res = obj.checkInclusion(s1,s2);
        boolean exp = false;
        Assert.assertEquals(exp,res);
    }
}