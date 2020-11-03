package com.joejang.algorithm.practice;

import java.util.Arrays;

public class ZhongShu {

    public int largestMinDist(int arr[], int k) {
        Arrays.sort(arr);
        int res = -1;
        int low = 1;
        int high = arr[arr.length - 1];
        while (low <= high) {
            int mid = (high + low) / 2;
            if (isFeasible(mid, arr, k)) {
                low = mid+1;
                res = Math.max(res, mid);
            } else {
                high = mid-1;
            }
        }
        return res;
    }

//    public int largestMinDist(int arr[], int k) {
//        Arrays.sort(arr);
//        int res = 01;
//        int left = arr[0];
//        int right = arr[arr.length - 1];
//
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (isFeasible(mid, arr, k)) {
//                res = Math.max(res, mid);
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return res;
//    }

    static boolean isFeasible(int dist, int arr[], int k) {
        int pos = arr[0];
        int elements = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pos >= dist) {
                pos = arr[i];
                elements++;
                if (elements == k) {
                    return true;
                }
            }
        }
        return false;
    }

}
