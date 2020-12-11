package com.joejang.algorithm.practice.slidingwindow;

/*
字符串的排列
给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。

换句话说，第一个字符串的排列之一是第二个字符串的子串。

示例1:

输入: s1 = "ab" s2 = "eidbaooo"
输出: True
解释: s2 包含 s1 的排列之一 ("ba").


示例2:

输入: s1= "ab" s2 = "eidboaoo"
输出: False


注意：

输入的字符串只包含小写字母
两个字符串的长度都在 [1, 10,000] 之间
 */
public class ZiFuChuanDePaiLie {
    // 滑动窗口，和ZuiXiaoFuGaiZiChuan的区别是，窗口大小固定为s1.length
    public boolean checkInclusion(String s1, String s2) {
        int[] window = new int['z' + 1];
        int[] need = new int['z' + 1];
        int winContainValid = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i)]++;
        }
        while (right < s2.length()) {
            // 不单独提取变量，性能下降20%
            char rightChr = s2.charAt(right);
            window[rightChr]++;
            // 更新
            // 如果需要该字符，并且已有窗口内的字符个数小于需要的字符个数
            if (need[rightChr] > 0 && need[rightChr] >= window[rightChr]) {
                winContainValid++;
            }
            right++;

            // 当需要的字符都已经包含在窗口中后，开始收缩 left
            while (winContainValid == s1.length()) {
                // 返回/更新
                if (right - left == s1.length()) {
                    return true;
                }
                // 需要删除的字符，必须留在窗口内，如果win[x]还大于need[x]，则不用valid--
                // 如果need[x]<=0，说明不需要该值，不影响valid；如果为需要值且左边界刚好只有need[x]个需要值，则移动窗口后，需要valid--
                char leftChr = s2.charAt(left);
                if (need[leftChr] > 0 && window[leftChr] == need[leftChr]) {
                    winContainValid--;
                }
                // 窗口左边界右移
                window[leftChr]--;
                left++;
            }
        }
        return false;
    }
}
