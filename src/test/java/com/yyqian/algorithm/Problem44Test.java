package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem44Test {
  @Test
  public void isContinuous() throws Exception {
    assertTrue(Problem44.isContinuous(new int[] {1,2,3,4,5}));
    assertTrue(Problem44.isContinuous(new int[] {2,3,4,5,6}));
    assertTrue(Problem44.isContinuous(new int[] {0,4,6,7,8}));
    assertTrue(Problem44.isContinuous(new int[] {0,0,6,7,8}));
    assertFalse(Problem44.isContinuous(new int[] {0,0,1,7,8}));
    assertFalse(Problem44.isContinuous(new int[] {3,4,1,7,8}));
  }

}