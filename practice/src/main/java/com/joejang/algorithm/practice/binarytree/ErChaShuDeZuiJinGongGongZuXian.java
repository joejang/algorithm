package com.joejang.algorithm.practice.binarytree;

import java.util.*;

import com.joejang.algorithm.practice.util.BinaryTreeUtil.TreeNode;

/*
考虑基本case
   c
   /\
  l  r
p=c,q=c => c:if p==q =>ret
p=l,q=c => c:非相同node->一个为c一个在子节点及以下节点的情况->find from(c) find 另一个
p=c,q=r => c
p=l,q=r => c:find from(c) find p 和 q都找到，则c OK（有前提）

前提：
pre traverse: OK
mid: 一半看不出
post: pre已经找到，不用post（实际还是会用到ret）
 */
public class ErChaShuDeZuiJinGongGongZuXian {
    /**
     * 定义为返回p和q的公共祖先，当root不包含p和q时，返回null，只包含q/p中的一个时，返回curr,表示curr下有p或q，pq都有的情况在最后做合并，返回root
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            // to leave
            return null;
        }
        if (p.val == q.val) {
            return q;
        }
        if (p.val == root.val || q.val == root.val) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    // old:
//    private boolean found = false;
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        HashSet<Integer> set = new HashSet<>();
//        List<Integer> list = new LinkedList<>();
//        visit(root, p, set);
//        found = false;
//        visit(root, q, list);
//        for (int i = 0; i < list.size(); i++) {
//            if (set.contains(list.get(i))) {
//                return new TreeNode(list.get(i));
//            }
//        }
//        return null;
//    }
//
//
//    private void visit(TreeNode root, TreeNode find, Collection<Integer> collection) {
//        if (root == null) {
//            return;
//        }
//        if (root.val == find.val) {
//            found = true;
//            collection.add(root.val);
//            return;
//        }
//        visit(root.left, find, collection);
//        if (found) {
//            collection.add(root.val);
//            return;
//        }
//        visit(root.right, find, collection);
//        if (found) {
//            collection.add(root.val);
//            return;
//        }
//    }
}
