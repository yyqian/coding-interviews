package com.yyqian.algorithm;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem18 {
  public static boolean hasSubtree(TreeNode<Integer> root1, TreeNode<Integer> root2) {
    if (root1 == null || root2 == null) {
      return false;
    }
    return include(root1, root2) || hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
  }

  private static boolean include(TreeNode<Integer> root1, TreeNode<Integer> root2) {
    if (root2 == null) {
      return true;
    } else if (root1 == null) {
      return false;
    }
    return root1.val.equals(root2.val) && include(root1.left, root2.left) && include(root1.right, root2.right);
  }
}
