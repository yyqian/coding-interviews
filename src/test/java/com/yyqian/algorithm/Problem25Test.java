package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem25Test {
  @Test
  public void printPath() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(
        10,
        new TreeNode<>(5, new TreeNode<>(4, null, null), new TreeNode<>(7, null, null)),
        new TreeNode<>(12, null, null));
    Problem25.printPath(root, 22);
  }

}