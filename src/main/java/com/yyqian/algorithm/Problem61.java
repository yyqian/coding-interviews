package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem61 {
  public static <T> void print(TreeNode<T> root) {
    StringBuilder sb = new StringBuilder();
    Deque<TreeNode<T>> stack = new ArrayDeque<>();
    Deque<TreeNode<T>> holder = new ArrayDeque<>();
    stack.push(root);
    int level = 0;
    while (!stack.isEmpty()) {
      int size = stack.size();
      for (int i = 0; i < size; i++) {
        TreeNode<T> current = stack.pop();
        sb.append(current.val);
        sb.append(" ");
        if ((level & 1) == 0) {
          //even
          if (current.left != null) holder.push(current.left);
          if (current.right != null) holder.push(current.right);
        } else {
          if (current.right != null) holder.push(current.right);
          if (current.left != null) holder.push(current.left);
        }
      }
      sb.append("\n");
      Deque<TreeNode<T>> temp = stack;
      stack = holder;
      holder = temp;
      level++;
    }
    System.out.println(sb.toString());
  }
}
