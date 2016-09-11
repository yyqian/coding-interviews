package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem36Test {
  @Test
  public void inversePairs() throws Exception {
    assertEquals(5, Problem36.inversePairs(new int[]{7, 5, 6, 4}));
    assertEquals(0, Problem36.inversePairs(new int[]{7}));
    assertEquals(1, Problem36.inversePairs(new int[]{7, 6}));
    assertEquals(3, Problem36.inversePairs(new int[]{7, 6, 5}));
    assertEquals(6, Problem36.inversePairs(new int[]{7, 6, 5, 4}));
    assertEquals(7 * (7 - 1) / 2, Problem36.inversePairs(new int[]{7, 6, 5, 4, 3, 2, 1}));
    assertEquals(0, Problem36.inversePairs(new int[]{1, 2, 3, 4, 5, 6, 7}));
    assertEquals(0, Problem36.inversePairs(new int[]{1, 2}));
    assertEquals(0, Problem36.inversePairs(new int[]{2, 2, 2}));
    assertEquals(0, Problem36.inversePairs(new int[]{1, 2, 2}));
  }

}