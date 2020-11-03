package com.joejang.algorithm.practice.binarysearch;

public class Sqrt {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long tmp = (long) mid * (long) mid;
            if (tmp == x) {
                return mid;
            } else if (tmp > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
