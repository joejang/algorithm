package com.joejang.algorithm.practice.backtracing;

import com.joejang.algorithm.practice.util.ArrayUtil;
import org.junit.Test;

import java.util.List;

public class QuanPaiLieTest {
    @Test
    public void test001() {
        QuanPaiLie obj = new QuanPaiLie();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> res = obj.permute(nums);
        ArrayUtil.printList(res);
    }
}