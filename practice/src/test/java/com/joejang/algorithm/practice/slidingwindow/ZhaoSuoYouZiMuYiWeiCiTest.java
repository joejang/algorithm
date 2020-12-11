package com.joejang.algorithm.practice.slidingwindow;

import com.joejang.algorithm.practice.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ZhaoSuoYouZiMuYiWeiCiTest {
    @Test
    public void test001() {
        ZhaoSuoYouZiMuYiWeiCi obj = new ZhaoSuoYouZiMuYiWeiCi();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = obj.findAnagrams(s, p);
        int[] exp = new int[]{0, 6};
        List<Integer> expList = Arrays.stream(exp).boxed().collect(Collectors.toList());
        Assert.assertTrue(ArrayUtil.listElemEquals(expList, res));
    }

    @Test
    public void test002() {
        ZhaoSuoYouZiMuYiWeiCi obj = new ZhaoSuoYouZiMuYiWeiCi();
        String s = "abab";
        String p = "ab";
        List<Integer> res = obj.findAnagrams(s, p);
        int[] exp = new int[]{0, 1, 2};
        List<Integer> expList = Arrays.stream(exp).boxed().collect(Collectors.toList());
        Assert.assertTrue(ArrayUtil.listElemEquals(expList, res));
    }
}