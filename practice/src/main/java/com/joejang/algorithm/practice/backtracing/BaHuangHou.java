package com.joejang.algorithm.practice.backtracing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
面试题 08.12. 八皇后
设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。这里的“对角线”指的是所有的对角线，不只是平分整个棋盘的那两条对角线。

注意：本题相对原题做了扩展

示例:

 输入：4
 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 解释: 4 皇后问题存在如下两个不同的解法。
[
 [".Q..",  // 解法 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // 解法 2
  "Q...",
  "...Q",
  ".Q.."]
]
 */
public class BaHuangHou {
    List<List<String>> res = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        if (n >0) {
            boolean[][] options = new boolean[n][n];
            backtrace(n, 0, options);
        }
        return res;
    }

    private void backtrace(int num, int line, boolean[][] options) {
        if (line >= num) {
            res.add(generateQipan(options));
            return;
        }

        for (int i = 0; i < num; i++) {
            if (isValid(options, line, i)) {
                options[line][i] = true;
                backtrace(num, line + 1, options);
                options[line][i] = false;
            }
        }
    }

    private boolean isValid(boolean[][] options, int x, int y) {
        for (int i = 0; i < options.length; i++) {
            if (options[x][i]) {
                return false;
            }
        }
        for (int i = 0; i < options.length; i++) {
            if (options[i][y]) {
                return false;
            }
        }
        for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
            if (options[i][j]) {
                return false;
            }
        }
        for (int i = x, j = y; i < options.length && j <options.length; i++, j++) {
            if (options[i][j]) {
                return false;
            }
        }
        for (int i = x, j = y; i < options.length && j >= 0; i++, j--) {
            if (options[i][j]) {
                return false;
            }
        }
        for (int i = x, j = y; i >= 0 && j <options.length; i--, j++) {
            if (options[i][j]) {
                return false;
            }
        }
        return true;
    }

    private List<String> generateQipan(boolean[][] options) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < options[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < options.length; j++) {
                sb.append(options[j][i] ? "Q" : ".");
            }
            res.add(sb.toString());
        }
        return res;

    }
}
