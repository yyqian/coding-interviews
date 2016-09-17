package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem59Test {
  @Test
  public void isSymmetrical() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(8, new TreeNode<>(6, new TreeNode<>(5), new TreeNode<>(7)), new TreeNode<>(6, new TreeNode<>(7), new TreeNode<>(5)));
    assertTrue(Problem59.isSymmetrical(root));
    root = new TreeNode<>(8, new TreeNode<>(6, new TreeNode<>(5), new TreeNode<>(7)), new TreeNode<>(9, new TreeNode<>(7), new TreeNode<>(5)));
    assertFalse(Problem59.isSymmetrical(root));
    root = new TreeNode<>(7, new TreeNode<>(7, new TreeNode<>(7), new TreeNode<>(7)), new TreeNode<>(7, new TreeNode<>(7), null));
    assertFalse(Problem59.isSymmetrical(root));
  }

}