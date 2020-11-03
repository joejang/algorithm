package com.joejang.algorithm.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return getIndex(nums, target);
    }

    private enum ORE {
        LEFT, RIGHT
    }

    public static int getIndex(int[] nums, int target) {
        int start = nums[0];
        int end = nums[nums.length - 1];
        if (target == start) {
            return 0;
        } else if (target == end) {
            return nums.length - 1;
        }
        ORE ore;
        if (target > start) {
            ore = ORE.LEFT;
        } else if (target < end) {
            ore = ORE.RIGHT;
        } else {
            return -1;
        }
        int halfIndex = nums.length / 2;
        int lastIndex = -1;
        Set<Integer> lastIndexSet = new HashSet<>();
        ORE lastOre = null;
        int step = 0;
        while (lastIndex != halfIndex) {
            step++;
            if (halfIndex >= nums.length || halfIndex <= 0) {
                return -1;
            }
            int halfVal = nums[halfIndex];
            if (target == halfVal) {
                return halfIndex;
            }
            ORE halfOre = getOre(halfVal, start, end);
            if (step > 15) {
                return -1;
            }
            // 不翻转的情况不判断方向
            if (Math.abs(lastIndex - halfIndex) == 1 && start < end) {
                return -1;
            }

            if (lastIndex - halfIndex == 1 && halfOre != lastOre) {
                return -1;
            }
            if (lastIndex - halfIndex == -1 && halfOre != lastOre) {
                return -1;
            }
            int gap = Math.abs(halfIndex - lastIndex) / 2;
            if (gap == 0) {
                gap = 1;
            }
            if (ore == halfOre) {
                lastIndex = halfIndex;
                lastIndexSet.add(lastIndex);
                if (halfVal > target) {
                    halfIndex -= gap;
                } else {
                    halfIndex += gap;
                }
            } else {
                lastIndex = halfIndex;
                lastIndexSet.add(lastIndex);
                if (ore == ORE.RIGHT) {
                    halfIndex += gap;
                } else {
                    halfIndex -= gap;
                    ;
                }
            }
            lastOre = halfOre;
        }
        return -1;
    }

    private static ORE getOre(int halfVal, int start, int end) {
        if (halfVal >= start) {
            return ORE.LEFT;
        } else {
            return ORE.RIGHT;
        }
    }

}
