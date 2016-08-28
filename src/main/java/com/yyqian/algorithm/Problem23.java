package com.yyqian.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem23 {
  public static void printTopToDown(TreeNode<Integer> root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode<Integer>> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode<Integer> node = queue.poll();
        System.out.println(node.val);
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
    }
  }
}
