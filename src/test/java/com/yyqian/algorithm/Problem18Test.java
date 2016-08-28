package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem18Test {
  @Test
  public void hasSubtree() throws Exception {
    TreeNode<Integer> root1 = new TreeNode<>(
        8,
        new TreeNode<>(8, new TreeNode<>(9, null, null), new TreeNode<>(2, new TreeNode<>(4, null, null), new TreeNode<>(7, null, null))),
        new TreeNode<>(7, null, null));
    TreeNode<Integer> root2 = new TreeNode<>(8, new TreeNode<>(9, null, null), new TreeNode<>(2, null, null));
    assertTrue(Problem18.hasSubtree(root1, root2));
    assertTrue(Problem18.hasSubtree(root1, new TreeNode<>(8, null, null)));
    assertTrue(Problem18.hasSubtree(root1, new TreeNode<>(7, null, null)));
    assertTrue(Problem18.hasSubtree(root1, new TreeNode<>(2, null, null)));
    assertFalse(Problem18.hasSubtree(null, root2));
  }

}