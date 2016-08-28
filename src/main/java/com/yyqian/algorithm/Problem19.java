package com.yyqian.algorithm;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem19 {
  public static void mirror(TreeNode<Integer> root) {
    if (root == null) {
      return;
    }
    TreeNode<Integer> temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirror(root.left);
    mirror(root.right);
  }
}
