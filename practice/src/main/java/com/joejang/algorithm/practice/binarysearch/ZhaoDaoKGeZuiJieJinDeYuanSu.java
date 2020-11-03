package com.joejang.algorithm.practice.binarysearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ZhaoDaoKGeZuiJieJinDeYuanSu {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int nearX = Collections.binarySearch(list, x);
        if (nearX >= 0) {
            // found
        } else {
            // not found
            nearX = -nearX - 1;
        }
        return null;
    }

    public int bs(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        if (target < arr[0]) {
            return -1;
        }
        if (target > arr[arr.length - 1]) {
            return 100001;
        }
        int mid = 0;
        int res = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
                res = mid;
            } else {
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
