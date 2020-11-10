package com.joejang.algorithm.practice.backtracing;

import java.util.*;
import java.util.stream.Collectors;

/*
给定一个 没有重复 数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class QuanPaiLie {
    private List<List<Integer>> res = new LinkedList<>();

    private Set<Integer> memo = new HashSet<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrace(new LinkedList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return res;
    }

    private void backtrace(List<Integer> path, List<Integer> options) {
        if (options.isEmpty()) {
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < options.size(); i++) {
            // do option
            if (path.contains(options.get(i))) {
                continue;
            }
            path.add(options.get(i));
            // bt
            Integer integer = options.remove(i);
            backtrace(path, options);
            // remove
            options.add(i, integer);
            path.remove(options.get(i));
        }
    }
}
