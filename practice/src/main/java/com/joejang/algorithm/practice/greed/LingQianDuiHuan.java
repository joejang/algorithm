package com.joejang.algorithm.practice.greed;

import java.util.*;
import java.util.stream.Collectors;

public class LingQianDuiHuan {
    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        dp[0] = 0;
        int cnt = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                cnt++;
                if (i - coin < 0 || dp[i - coin] < 0) {
                    continue;
                } else {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        System.out.println(cnt);
        return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }

    private int bfs(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int cnt2 = 0;
        List<Integer> list = Arrays.stream(coins).boxed().collect(Collectors.toList());
        Collections.sort(list);

        Queue<Long> queue = new LinkedList<>();
        queue.add(0L);
        int minCnt = Integer.MAX_VALUE;
        boolean found = false;
        Set<Long> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            FOR:
            for (int i = 0; i < size; i++) {
                Long longNum = queue.poll();
                int cnt = (int) (longNum >> 40);
                int num = (int) (longNum & 0xFFFFFFFF);
                if (cnt >= minCnt) {
                    continue;
                }
                for (int j = list.size() - 1; j >= 0; j--) {
                    cnt2++;
                    if (num + list.get(j) == amount) {
                        found = true;
                        minCnt = Math.min(minCnt, cnt + 1);
                        continue FOR;
                    } else if (num + list.get(j) > amount) {
                        continue;
                    } else {
                        long key = (((long) cnt + 1) << 40) + (long) (num + list.get(j));
                        if (!visited.contains(key)) {
                            visited.add(key);
                            queue.add(key);
                        }
                    }
                }
            }
        }
        System.out.println(cnt2);
        return found ? minCnt : -1;
    }

    /**
     * greed policy: from large to small
     *
     * @param list
     * @param amount
     * @param limit
     * @return
     */
    private boolean isOk(List<Integer> list, int amount, int limit) {
        int accumulated = 0;
        FOR:
        for (int i = 1; i <= limit; i++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if (accumulated + list.get(j) == amount && i <= limit) {
                    return true;
                }
                if (accumulated + list.get(j) < amount) {
                    accumulated += list.get(j);
                    continue FOR;
                }
                if (j == 0) {
                    return false;
                }
                continue;
            }
        }
        return false;
    }

    private boolean bfs(List<Integer> list, int amount, int limit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int layer = 0;
        Set<Integer> set = new HashSet<>();
        while (!queue.isEmpty()) {
            layer++;
            if (layer > limit) {
                return false;
            }
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer num = queue.poll();
                for (int j = list.size() - 1; j >= 0; j--) {
                    if (num + list.get(j) == amount) {
                        if (layer == limit) {
                            return true;
                        } else {
                            continue;
                        }
                    }
                    if (num + list.get(j) < amount && !set.contains(num + list.get(j))) {
                        queue.add(num + list.get(j));
                        set.add(num + list.get(j));
                    }
                }
            }
        }
        return false;
    }
}
