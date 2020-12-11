package com.joejang.algorithm.practice.binarytree;

import com.joejang.algorithm.practice.util.BinaryTreeUtil.TreeNode;

/*
二叉树中的最大路径和
给定一个非空二叉树，返回其最大路径和。

本题中，路径被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。



示例 1：

输入：[1,2,3]

       1
      / \
     2   3

输出：6
示例 2：

输入：[-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

输出：42
 */
/*
(前序遍历：要考虑最大值，前序根本不知道后面的值是多少，无法判定max；
 中：同样，有一侧不知道
 后：l、r、curr都知道，可以写出max 的递归
)
                 max value几种情况：1.底部某段2.中间某段3.中间某段跨left、root、right4.全局left、root、right5.从底到root单一分支
                                                                                                              v
1.TAM:BT->遍历(前、中、后)->后序遍历->考虑中间某一段为解的情况，max value可能在遍历中某一段就产生->引入全局变量记录max value+返回当前节点最大收益
                                  ^
                                  max value
        ->定义f(node)为返回包含node.value的单链路最大值+中间断裂、跨root的最大值由全局值记录，覆盖1-5种情况->:
        f(node):
            node==null ret 0
            lv = f(node.l)
            rv = f(node.r)
            如果有断裂的情况
            10
            /\
           n -10
              /\
             n 5
            在root处理过程中，根据以上逻辑，会任务f(-10节点)=-5，在f(10节点）处理时，应返回10，而不应返回-5，处理逻辑为：
            current node val + 大于0的max(lv, rv)值，否则不加该值
            ret node.v + max(lv,rv)(>0 else 0)

            中间部分还需要处理全局变量记录最大值，最大值为max(currMaxVal,正数lv+root.val+正数rv)=(非正数则不加该值)
            currMaxVal = max(currMaxVal, lv+root+rv, lv+root, root+rv, root)

2.TEST CASE:
考虑0,-1,1边界值
考虑空、单层、二层、三层、四层
考虑null值
考虑单侧树
考虑底部取max、中部某root取max、root取max
考虑底部某直连段取max、底到root值连段取max
考虑底部跨root取max、中部跨root取max、顶部跨root取max
考虑多弯折情况
考虑正、负取值在以上各情况下的复合情况
=>50个左右的用例
 */
public class ErChaShuZhongDeZuiDaLuJinHe {
    private long res = Long.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        visitReturnMax(root);
        return (int) res;
    }

    private int visitReturnMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = visitReturnMax(root.left);
        int rightVal = visitReturnMax(root.right);
        // 把最大的路径值筛选出来,memory

        res = max(res, root.val, root.val + leftVal + rightVal, root.val + leftVal, root.val + rightVal);

        return root.val + Math.max(leftVal > 0 ? leftVal : 0, rightVal > 0 ? rightVal : 0);
    }


    private long max(long... nums) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
