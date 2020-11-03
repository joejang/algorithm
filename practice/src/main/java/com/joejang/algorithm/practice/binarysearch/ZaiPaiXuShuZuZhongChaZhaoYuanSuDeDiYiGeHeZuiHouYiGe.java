package com.joejang.algorithm.practice.binarysearch;

public class ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int first = bsLeftMatch2(nums, 0, nums.length - 1, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = bsRightMatch2(nums, first, nums.length - 1, target);
        return new int[]{first, last};
    }

    private int bsLeftMatch(int[] nums, int start, int end, int target) {
        int low = start;
        int high = end;
        if (nums.length > 0 && nums[0] == target) {
            return 0;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                high = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target) {
            return low;
        }
        return -1;
    }

    private int bsRightMatch(int[] nums, int start, int end, int target) {
        int low = start;
        int high = end;
        if (nums.length > 0 && nums[end] == target) {
            return end;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (nums[mid + 1] > nums[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (nums[high] == target) {
            return high;
        }
        return -1;
    }

    private int bsLeftMatch2(int[] nums, int start, int end, int target) {
        int low = start;
        int high = end;
        if (nums.length > 0 && nums[0] == target) {
            return 0;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid -1] < target) {
                    return mid;
                }
                high = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    private int bsRightMatch2(int[] nums, int start, int end, int target) {
        int low = start;
        int high = end;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid;
                }
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
