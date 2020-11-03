package com.joejang.algorithm.practice.binarysearch;

/*
搜索螺旋排序数组s
 */

public class SouSuoLuoXuanPaiXuShuZu {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= nums[0]) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }

        if (nums[res] == target){
            return res;
        } else if (nums[res] > target && target >= nums[0]) {
            return binarySearch(nums, target, 0, res);
        } else {
            return binarySearch(nums, target, res + 1, nums.length - 1);
        }
    }

    private int binarySearch(int[] nums, int target, int intputLow, int inputHigh) {
        int low = intputLow;
        int high = inputHigh;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
