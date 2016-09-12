package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem50 {
  // 如果树是 Search Tree
  public static TreeNode<Integer> getCommonST(TreeNode<Integer> root, TreeNode<Integer> node1, TreeNode<Integer> node2) {
    TreeNode<Integer> left;
    TreeNode<Integer> right;
    if (node1.val < node2.val) {
      left = node1;
      right = node2;
    } else {
      left = node2;
      right = node1;
    }
    if (root.val > right.val) {
      return getCommonST(root.left, node1, node2);
    } else if (root.val < left.val) {
      return getCommonST(root.right, node1, node2);
    } else {
      return root;
    }
  }

  // 如果不是搜索树
  public static <T> TreeNode<T> getCommonGeneral(TreeNode<T> root, TreeNode<T> node1, TreeNode<T> node2) {
    Deque<TreeNode<T>> path = new ArrayDeque<>();
    Deque<TreeNode<T>> path1 = new ArrayDeque<>();
    Deque<TreeNode<T>> path2 = new ArrayDeque<>();
    assert findPath(root, node1, path, path1);
    assert findPath(root, node2, path, path2);
    TreeNode<T> result = null;
    while (path1.peek() == path2.peek()) {
      result = path1.pop();
      path2.pop();
    }
    return result;
  }

  private static <T> boolean findPath(TreeNode<T> root, TreeNode<T> node, Deque<TreeNode<T>> path, Deque<TreeNode<T>> result) {
    if (root == null) {
      return false;
    }
    path.push(root);
    boolean isFound;
    if (root.val.equals(node.val)) {
      path.forEach(result::push);
      isFound = true;
    } else {
      isFound = findPath(root.left, node, path, result);
      if (!isFound) {
        isFound = findPath(root.right, node, path, result);
      }
    }
    path.pop();
    return isFound;
  }
}
