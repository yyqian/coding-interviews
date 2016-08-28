package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem23Test {
  @Test
  public void printTopToDown() throws Exception {
    Problem23.printTopToDown(new TreeNode<>(
        8,
        new TreeNode<Integer>(6, new TreeNode<Integer>(5, null, null), new TreeNode<Integer>(7, null, null)),
        new TreeNode<Integer>(10, new TreeNode<Integer>(9, null, null), new TreeNode<Integer>(11, null, null))));
  }

}