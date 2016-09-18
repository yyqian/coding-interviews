package com.yyqian.algorithm;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem63 {
  private int count;
  private int result;
  public int topK(TreeNode<Integer> root, int k) {
    count = k;
    inOrder(root);
    return result;
  }
  private void inOrder(TreeNode<Integer> root) {
    if (root == null || count == 0) {
      return;
    }
    inOrder(root.left);
    count--;
    if (count == 0) {
      result = root.val;
      return;
    }
    inOrder(root.right);
  }
}
