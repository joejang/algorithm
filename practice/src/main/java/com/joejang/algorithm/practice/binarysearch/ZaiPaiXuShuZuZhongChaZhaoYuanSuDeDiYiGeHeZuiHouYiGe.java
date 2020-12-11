package com.joejang.algorithm.practice.binarysearch;

public class ZaiPaiXuShuZuZhongChaZhaoYuanSuDeDiYiGeHeZuiHouYiGe {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int first = bsLeftMatch3(nums, 0, nums.length - 1, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = bsRightMatch3(nums, first, nums.length - 1, target);
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
                if (mid == 0 || nums[mid - 1] < target) {
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

    public int bsLeftMatch3(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 最后要检查 left 越界的情况
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }

    public int bsRightMatch3(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }

    public int bs(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 直接返回
                return mid;
            }
        }
        // 直接返回
        return -1;
    }
}
