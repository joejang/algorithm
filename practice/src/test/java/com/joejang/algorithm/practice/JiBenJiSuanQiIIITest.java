package com.joejang.algorithm.practice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JiBenJiSuanQiIIITest {
    @Test
    public void test001() {
        JiBenJiSuanQiIII obj = new JiBenJiSuanQiIII();
        String s = "";
        int res = obj.calculate(s);
        int exp = 0;
        Assert.assertEquals(exp, res);
    }
}