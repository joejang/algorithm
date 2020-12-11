package com.joejang.algorithm.practice.bfs;

import java.util.*;
import java.util.stream.Collectors;

/*
752. 打开转盘锁
你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。
每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。

锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。

列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。

字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。



示例 1:

输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
输出：6
解释：
可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
因为当拨动到 "0102" 时这个锁就会被锁定。
示例 2:

输入: deadends = ["8888"], target = "0009"
输出：1
解释：
把最后一位反向旋转一次即可 "0000" -> "0009"。
示例 3:

输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
输出：-1
解释：
无法旋转到目标数字且不被锁定。
示例 4:

输入: deadends = ["0000"], target = "8888"
输出：-1


提示：

死亡列表 deadends 的长度范围为 [1, 500]。
目标数字 target 不会在 deadends 之中。
每个 deadends 和 target 中的字符串的数字会在 10,000 个可能的情况 '0000' 到 '9999' 中产生。

 */
/*
TAM:bs被排除->求最值+多组合+量不大->bfs->^deadends+贴近场景分析(每次旋转都只能旋转一个拨轮的一位数字。)->8叉->o->^begin、target都已知->双向BFS->O
CASE:
边界：0000,0001,9999,1000,0100,0010,0110,1100,0011
deadends：基本、全死
 */
public class DaKaiZhuanPanSuo {
    private Set<String> deadendsSet = new HashSet<>();
    private Set<String> visited = new HashSet<>();

    private String up(String lock, int bit) {
        byte[] bytes = lock.getBytes();
        byte chr = bytes[bit];
        chr++;
        if (chr > '9') {
            chr = '0';
        }
        bytes[bit] = chr;
        return new String(bytes);
    }

    private String down(String lock, int bit) {
        byte[] bytes = lock.getBytes();
        byte chr = bytes[bit];
        chr--;
        if (chr < '0') {
            chr = '9';
        }
        bytes[bit] = chr;
        return new String(bytes);
    }

    public int openLock(String[] deadends, String target) {
        String init = "0000";
        deadendsSet.addAll(Arrays.stream(deadends).collect(Collectors.toList()));
        if (deadendsSet.contains(target) || deadendsSet.contains(init)) {
            return -1;
        }
        if (init.equals(target)) {
            return 0;
        }
        int move = -1;
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        q1.add(init);
        q2.add(target);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            // 每次从小的q扩散
            if (q1.size() > q2.size()) {
                Queue<String> tmp = q1;
                q1 = q2;
                q2 = tmp;
            }
            int size = q1.size();
            move++;
            for (int i = 0; i < size; i++) {
                String currLock = q1.poll();
                if (deadendsSet.contains(currLock) || visited.contains(currLock)) {
                    continue;
                }
                visited.add(currLock);
                if (q2.contains(currLock)) {
                    return move;
                }
                for (int j = 0; j < 4; j++) {
                    q1.add(up(currLock, j));
                    q1.add(down(currLock, j));
                }
            }
        }
        return -1;
    }
}
