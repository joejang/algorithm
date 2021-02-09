package com.joejang.algorithm.practice.dp;

import java.util.Arrays;

//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。
//
// 你可以认为每种硬币的数量是无限的。
//
//
//
// 示例 1：
//
//
//输入：coins = [1, 2, 5], amount = 11
//输出：3
//解释：11 = 5 + 5 + 1
//
// 示例 2：
//
//
//输入：coins = [2], amount = 3
//输出：-1
//
// 示例 3：
//
//
//输入：coins = [1], amount = 0
//输出：0
//
//
// 示例 4：
//
//
//输入：coins = [1], amount = 1
//输出：1
//
//
// 示例 5：
//
//
//输入：coins = [1], amount = 2
//输出：2
//
//
//
//
// 提示：
//
//
// 1 <= coins.length <= 12
// 1 <= coins[i] <= 231 - 1
// 0 <= amount <= 104
//
// Related Topics 动态规划
// 👍 1056 👎 0

/**
 * 1.BSOD+状态转移方程过程标准化
 * 2.初始态amount==0,dp[0],dp[*]的初始化
 * 3.边界值2^31-1为int.max,dp[n]最大值amount+1，可设为int.max，n最大值10^4
 */
public class LingQianDuiHuan {
    public int coinChange(int[] coins, int amount) {
        // B amount=0
        // S amount
        // O coins[]
        // D dp[amount]=达成amount所需最小coin个数
        // F dp=0,n=0, dp=-1,n<0, dp=min(dp(n-coin)|coin in coins) + 1)
        // INITIAL dp[*]=amount+1
        if (amount == 0) {
            return 0;
        }
        int INF = -1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int n = 1; n <= amount; n++) {
            dp[n] = min(coins, dp, n);
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    private int min(int[] coins, int[] dp, int n) {
        // min(dp(n-coin)|coin in coins) + 1)
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (n - coins[i] < 0) {
                continue;
            }
            min = Math.min(min, dp[n - coins[i]]);
        }
        if (min == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return min + 1;
    }
}
