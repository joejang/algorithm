package com.joejang.algorithm.practice.bfs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaKaiZhuanPanSuoTest {
    @Test
    public void test001() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{};
        String target = "0000";
        int res = obj.openLock(deadends, target);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test002() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"0000"};
        String target = "0000";
        int res = obj.openLock(deadends, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test003() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"0001"};
        String target = "0002";
        int res = obj.openLock(deadends, target);
        int exp = 4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test004() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"0001,1111,9999"};
        String target = "5555";
        int res = obj.openLock(deadends, target);
        int exp = 20;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test005() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"1111"};
        String target = "1111";
        int res = obj.openLock(deadends, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test006() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"0001", "1000", "0100", "0010"};
        String target = "1111";
        int res = obj.openLock(deadends, target);
        int exp = 6;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void test007() {
        DaKaiZhuanPanSuo obj = new DaKaiZhuanPanSuo();
        String[] deadends = new String[]{"0001", "1000", "0100", "0010", "9000", "0900", "0090", "0009"};
        String target = "1111";
        int res = obj.openLock(deadends, target);
        int exp = -1;
        Assert.assertEquals(exp, res);
    }
}