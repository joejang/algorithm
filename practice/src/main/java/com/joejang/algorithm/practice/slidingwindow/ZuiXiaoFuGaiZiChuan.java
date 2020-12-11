package com.joejang.algorithm.practice.slidingwindow;

import java.util.*;

/*
76. 最小覆盖子串
给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。

注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。



示例 1：

输入：s = "ADOBECODEBANC", t = "ABC"
输出："BANC"
示例 2：

输入：s = "a", t = "a"
输出："a"


提示：

1 <= s.length, t.length <= 10^5
s 和 t 由英文字母组成
 */
/*
滑动窗口解决
 */
public class ZuiXiaoFuGaiZiChuan {
    // 数值控制窗口，不用hashmap 性能最好
    public String minWindow(String s, String t) {
        int[] window = new int['z' + 1];
        int[] need = new int['z' + 1];
        int winContainValid = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        while (right < s.length()) {
            // 不单独提取变量，性能下降20%
            char rightChr = s.charAt(right);
            window[rightChr]++;
            // 更新
            // 如果需要该字符，并且已有窗口内的字符个数小于需要的字符个数
            if (need[rightChr] > 0 && need[rightChr] >= window[rightChr]) {
                winContainValid++;
            }
            right++;

            // 当需要的字符都已经包含在窗口中后，开始收缩 left
            while (winContainValid == t.length()) {
                // 更新
                if (minLen > right - left) {
                    minLen = right - left;
                    start = left;
                }
                // 需要删除的字符，必须留在窗口内，如果win[x]还大于need[x]，则不用valid--
                // 如果need[x]<=0，说明不需要该值，不影响valid；如果为需要值且左边界刚好只有need[x]个需要值，则移动窗口后，需要valid--
                char leftChr = s.charAt(left);
                if (need[leftChr] > 0 && window[leftChr] == need[leftChr]) {
                    winContainValid--;
                }
                // 窗口左边界右移
                window[leftChr]--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
// labuladong 没过
//    public String minWindow(String s, String t) {
//        HashMap<Character, Integer> need = new HashMap<>();
//        HashMap<Character, Integer> window = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
//        }
//
//        int left = 0;
//        int right = 0;
//        int valid = 0;
//        // 记录最小覆盖子串的起始索引及长度
//        int start = 0;
//        int len = Integer.MAX_VALUE;
//        while (right < s.length()) {
//            // c 是将移入窗口的字符
//            char c = s.charAt(right);
//            // 右移窗口
//            right++;
//            // 进行窗口内数据的一系列更新
//            if (need.containsKey(c)) {
//                window.put(t.charAt(c), window.getOrDefault(t.charAt(c), 0) + 1);
//                if (window.get(t.charAt(c)).equals(need.get(t.charAt(c)))) {
//                    valid++;
//                }
//            }
//
//            // 判断左侧窗口是否要收缩
//            while (valid == need.size()) {
//                // 在这里更新最小覆盖子串
//                if (right - left < len) {
//                    start = left;
//                    len = right - left;
//                }
//                // d 是将移出窗口的字符
//                char d = s.charAt(left);
//                // 左移窗口
//                left++;
//                // 进行窗口内数据的一系列更新
//                if (need.containsKey(d)) {
//                    if (window.get(t.charAt(d)).equals(need.get(t.charAt(d)))) {
//                        valid--;
//                        window.put(t.charAt(c), window.getOrDefault(t.charAt(c), 0) - 1);
//                    }
//                }
//            }
//        }
//        // 返回最小覆盖子串
//        return len == Integer.MAX_VALUE ?
//                "" : s.substring(start, len);
//    }
//    //  不借助HashMap，自制hash表 滑动窗口双指针
//    public String minWindow(String s, String t) {
//        int[] window = new int[256];
//        int[] target = new int[256];
//        int left = 0;
//        int right = 0;
//        int minLen = Integer.MAX_VALUE;
//        int start = 0;
//        for (int i = 0; i < t.length(); i++) {
//            target[t.charAt(i)]++;
//        }
//        while (right < s.length()) {
//            window[s.charAt(right)]++;
//            right++;
//            while (windowContainsAll(window, target)) {
//                if (minLen > right - left) {
//                    minLen = right - left;
//                    start = left;
//                }
//                window[s.charAt(left)]--;
//                left++;
//            }
//        }
//        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
//    }
//
//    private boolean windowContainsAll(int[] window, int[] target) {
//        for (int i = 'A'; i < target.length; i++) {
//            // lc上如果写成 i<= (int) 'z' 会慢几乎一倍
//            if (i > (int) 'z') {
//                return true;
//            }
//            if (target[i] > window[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
// 借助HashMap 滑动窗口双指针
//    public String minWindow(String s, String t) {
//        Map<Character, Integer> window = new HashMap<>();
//        Map<Character, Integer> target = new HashMap<>();
//        int start = 0;
//        int minLen = Integer.MAX_VALUE;
//        int left = 0;
//        int right = 0;
//        for (int i = 0; i < t.length(); i++) {
//            putOrIncrease(target, t.charAt(i));
//        }
//
//        while (right < s.length()) {
//            putOrIncrease(window, s.charAt(right));
//            right++;
//            while (windowContainsAll(window, target)) {
//                if (right - left < minLen) {
//                    minLen = right - left;
//                    start = left;
//                }
//                // [left]下标的char如果在target中，则window要移除该值
//                Character leftChar = s.charAt(left);
//                removeOrDecrease(window, leftChar);
//                left++;
//            }
//        }
//        if (minLen != Integer.MAX_VALUE) {
//            return s.substring(start, start + minLen);
//        }
//        return "";
//    }
//
//    private void putOrIncrease(Map<Character, Integer> map, Character key) {
//        map.put(key, map.getOrDefault(key, 0) + 1);
//    }
//
//    private void removeOrDecrease(Map<Character, Integer> map, Character key) {
//        map.put(key, map.get(key) - 1);
//    }
//
//    private boolean windowContainsAll(Map<Character, Integer> window, Map<Character, Integer> target) {
//        Iterator<Map.Entry<Character, Integer>> itr = target.entrySet().iterator();
//        while (itr.hasNext()) {
//            Map.Entry<Character, Integer> entry = itr.next();
//            if (window.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
//                return false;
//            }
//        }
//        return true;
//    }
}
