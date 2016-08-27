package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem6Test {

  @Test
  public void testConstruct() throws Exception {
    Problem6 problem6 = new Problem6();
    TreeNode<Integer> head = problem6.construct(
        new int[]{1, 2, 4, 7, 3, 5, 6, 8}
        , new int[]{4, 7, 2, 1, 5, 3, 8, 6});
    assertEquals(1, head.val.intValue());
    assertEquals(2, head.left.val.intValue());
    assertEquals(4, head.left.left.val.intValue());
    assertEquals(7, head.left.left.right.val.intValue());
    assertEquals(3, head.right.val.intValue());
    assertEquals(5, head.right.left.val.intValue());
    assertEquals(6, head.right.right.val.intValue());
    assertEquals(8, head.right.right.left.val.intValue());
  }

}