package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem24Test {
  @Test
  public void verifyPostorder() throws Exception {
    assertTrue(Problem24.verifyPostorder(new int[] {5,7,6,9,11,10,8}));
    assertTrue(Problem24.verifyPostorder(new int[] {3,4,5}));
    assertTrue(Problem24.verifyPostorder(new int[] {4,3,5}));
    assertTrue(Problem24.verifyPostorder(new int[] {6,7,5}));
    assertFalse(Problem24.verifyPostorder(new int[] {7,4,6,5}));
  }

}