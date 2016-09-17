package com.yyqian.algorithm;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem59 {
  public static <T> boolean isSymmetrical(TreeNode<T> root) {
    if (root == null) {
      return false;
    }
    return isMirrorable(root.left, root.right);
  }
  private static <T> boolean isMirrorable(TreeNode<T> root1, TreeNode<T> root2) {
    if (root1 == null || root2 == null) {
      return root1 == root2;
    }
    return root1.val.equals(root2.val)
        && isMirrorable(root1.left, root2.right)
        && isMirrorable(root1.right, root2.left);
  }
}
