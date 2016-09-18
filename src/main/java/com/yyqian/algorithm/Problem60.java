package com.yyqian.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem60 {
  public static <T> void print(TreeNode<T> root) {
    StringBuilder sb = new StringBuilder();
    Queue<TreeNode<T>> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode<T> current = queue.poll();
        sb.append(current.val);
        sb.append(" ");
        if (current.left != null) queue.offer(current.left);
        if (current.right != null) queue.offer(current.right);
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
