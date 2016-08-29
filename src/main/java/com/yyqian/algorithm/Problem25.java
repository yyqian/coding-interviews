package com.yyqian.algorithm;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem25 {
  public static void printPath(TreeNode<Integer> root, int target) {
    print(root, target, "");
  }
  private static void print(TreeNode<Integer> root, int target, String path) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      if (root.val.equals(target)) {
        System.out.println(path + " " + root.val);
      }
      return;
    }
    print(root.left, target - root.val, path + " " + root.val);
    print(root.right, target - root.val, path + " " + root.val);
  }
}
