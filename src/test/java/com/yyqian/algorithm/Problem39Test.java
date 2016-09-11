package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem39Test {
  @Test
  public void depth() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(1, new TreeNode<>(2, new TreeNode<>(4, null, null), new TreeNode<>(5, new TreeNode<>(7, null, null), null)), new TreeNode<>(3, null, new TreeNode<>(6, null, null)));
    assertEquals(4, Problem39.depth(root));
  }

}