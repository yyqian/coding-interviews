package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem50Test {
  @Test
  public void getCommon() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(3, new TreeNode<>(1), new TreeNode<>(5, new TreeNode<>(4), new TreeNode<>(6, null, new TreeNode<>(7))));
    assertEquals(root, Problem50.getCommonST(root, new TreeNode<>(1), new TreeNode<>(3)));
    assertEquals(root.right, Problem50.getCommonST(root, new TreeNode<>(4), new TreeNode<>(7)));
    assertEquals(root.right, Problem50.getCommonST(root, new TreeNode<>(5), new TreeNode<>(7)));
    assertEquals(root, Problem50.getCommonGeneral(root, new TreeNode<>(1), new TreeNode<>(3)));
    assertEquals(root.right, Problem50.getCommonGeneral(root, new TreeNode<>(4), new TreeNode<>(7)));
    assertEquals(root.right, Problem50.getCommonGeneral(root, new TreeNode<>(5), new TreeNode<>(7)));
  }

}