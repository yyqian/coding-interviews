package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem39 {
  public static <T> int depth(TreeNode<T> root) {
    if (root == null) {
      return 0;
    } else {
      return Math.max(depth(root.left), depth(root.right)) + 1;
    }
  }
}
