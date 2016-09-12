package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class TreeNode<T> {
  T val;
  TreeNode<T> left;
  TreeNode<T> right;

  public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public TreeNode(T val) {
    this(val, null, null);
  }
}
