package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem19Test {
  @Test
  public void mirror() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(
        8,
        new TreeNode<>(6, new TreeNode<>(5, null, null), new TreeNode<>(7, null, null)),
        new TreeNode<>(10, new TreeNode<>(9, null, null), new TreeNode<>(11, null, null))
    );
    Problem19.mirror(root);
    assertEquals(8, root.val.intValue());
    assertEquals(10, root.left.val.intValue());
    assertEquals(11, root.left.left.val.intValue());
    assertEquals(9, root.left.right.val.intValue());
    assertEquals(6, root.right.val.intValue());
    assertEquals(7, root.right.left.val.intValue());
    assertEquals(5, root.right.right.val.intValue());
  }

}