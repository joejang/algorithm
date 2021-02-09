package com.joejang.algorithm.practice.dp;


/*
188. 买卖股票的最佳时机 IV
给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。



示例 1：

输入：k = 2, prices = [2,4,1]
输出：2
解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
示例 2：

输入：k = 2, prices = [3,2,6,5,0,3]
输出：7
解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
     随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。


提示：

0 <= k <= 109
0 <= prices.length <= 1000
0 <= prices[i] <= 1000
 */
public class MaiMaiGuPiaoDeZuiJiaShiJi {
    private static int IMPOSSIBLE = Integer.MIN_VALUE;

    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length][k][2];
        int res = 0;
        // dp[day][kRemain][status] = 第day天,可操作kRemain次,在status=已持有/未持有 时，从上一个状态开始，经过一次操作能达到的最大收益
        // 初始化
        // 1.0 0 0 = 0
        // 2.0 0 1 = Imp
        // 3.0 > 0 = 0
        // 4.0 > 1 = Imp
        // 5.> 0 0 = 0
        // 6.> 0 1 = Imp
        // 7.> > 0 = 0
        // 8.> > 1 = 0

        // 初始化
        for (int day = 0; day < prices.length; day++) {
            for (int kRemain = 0; kRemain < k; kRemain++) {
                for (int status = 0; status <= 1; status++) {
                    if (day == 0 && kRemain == 0 && status == 1) {
                        dp[day][kRemain][status] = IMPOSSIBLE;
                    } else if (day == 0 && kRemain > 0 && status == 1) {
                        dp[day][kRemain][status] = IMPOSSIBLE;
                    } else if (day > 0 && kRemain == 0 && status == 1) {
                        dp[day][kRemain][status] = IMPOSSIBLE;
                    }
                }
            }
        }

        for (int day = 0; day < prices.length; day++) {
            for (int kRemain = 0; kRemain < k; kRemain++) {
                if (day == 0) {
                    dp[day][kRemain][0] = Math.max(dp[day - 1][kRemain][0], dp[day - 1][kRemain - 1][1] + prices[day]);
                    dp[day][kRemain][1] = Math.max(dp[day - 1][kRemain - 1][0] - prices[day], dp[day - 1][kRemain][1]);
                }
                dp[day][kRemain][0] = Math.max(dp[day - 1][kRemain][0], dp[day - 1][kRemain - 1][1] + prices[day]);
                dp[day][kRemain][1] = Math.max(dp[day - 1][kRemain - 1][0] - prices[day], dp[day - 1][kRemain][1]);
            }
        }

        for (int day = 0; day < prices.length; day++) {
            for (int kRemain = 0; kRemain < k; kRemain++) {
                for (int status = 0; status < 1; status++) {
                    res = Math.max(dp[day][kRemain][status], res);
                }
            }
        }
        return res;
    }
}
