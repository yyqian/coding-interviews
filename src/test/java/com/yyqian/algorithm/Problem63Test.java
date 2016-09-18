package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem63Test {
  @Test
  public void topK() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(5,
        new TreeNode<>(3, new TreeNode<>(2), new TreeNode<>(4)),
        new TreeNode<>(7, new TreeNode<>(6), new TreeNode<>(8)));
    Problem63 problem63 = new Problem63();
    assertEquals(2, problem63.topK(root, 1));
    assertEquals(3, problem63.topK(root, 2));
    assertEquals(4, problem63.topK(root, 3));
    assertEquals(5, problem63.topK(root, 4));
    assertEquals(6, problem63.topK(root, 5));
    assertEquals(7, problem63.topK(root, 6));
    assertEquals(8, problem63.topK(root, 7));
  }

}