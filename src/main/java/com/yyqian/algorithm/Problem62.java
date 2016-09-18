package com.yyqian.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem62 {
  public static <T> String serialize(TreeNode<T> root) {
    if (root == null) {
      return "*";
    }
    return root.val + "," + serialize(root.left) + "," + serialize(root.right);
  }

  public static TreeNode<Integer> deserialize(String str) {
    return recur(new LinkedList<>(Arrays.asList(str.split(","))));
  }

  private static TreeNode<Integer> recur(Queue<String> queue) {
    String top = queue.poll();
    if (top.equals("*")) {
      return null;
    } else {
      TreeNode<Integer> root = new TreeNode<>(Integer.valueOf(top));
      root.left = recur(queue);
      root.right = recur(queue);
      return root;
    }
  }
}
