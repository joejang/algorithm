package com.joejang.algorithm.practice.backtracing;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BaHuangHouTest {
    @Test
    public void test001() {
        BaHuangHou obj = new BaHuangHou();
        List<List<String>> res = obj.solveNQueens(0);
        print(res);
    }

    @Test
    public void test002() {
        BaHuangHou obj = new BaHuangHou();
        List<List<String>> res = obj.solveNQueens(1);
        print(res);
    }


    @Test
    public void test003() {
        BaHuangHou obj = new BaHuangHou();
        List<List<String>> res = obj.solveNQueens(2);
        print(res);
    }


    @Test
    public void test004() {
        BaHuangHou obj = new BaHuangHou();
        List<List<String>> res = obj.solveNQueens(3);
        print(res);
    }


    @Test
    public void test005() {
        BaHuangHou obj = new BaHuangHou();
        List<List<String>> res = obj.solveNQueens(4);
        print(res);
    }

    private void print(List<List<String>> res) {
        System.out.print("[");
        for (List<String> list : res) {
            System.out.print("[");
            for (String str : list) {
                System.out.print(str);
                System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}