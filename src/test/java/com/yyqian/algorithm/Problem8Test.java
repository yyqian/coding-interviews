package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem8Test {
  @Test
  public void min() throws Exception {
    Problem8 problem8 = new Problem8();
    assertEquals(1, problem8.min(new int[]{1, 2, 3, 4, 5}));
    assertEquals(1, problem8.min(new int[]{2, 3, 4, 5, 1}));
    assertEquals(1, problem8.min(new int[]{3, 4, 5, 1, 2}));
    assertEquals(1, problem8.min(new int[]{4, 5, 1, 2, 3}));
    assertEquals(1, problem8.min(new int[]{5, 1, 2, 3, 4}));
    assertEquals(5, problem8.min(new int[]{5}));
    assertEquals(0, problem8.min(new int[]{1, 0, 1, 1, 1}));
    assertEquals(0, problem8.min(new int[]{1, 1, 1, 0, 1}));
  }

  @Test(expected = RuntimeException.class)
  public void testBadInput() {
    Problem8 problem8 = new Problem8();
    problem8.min(new int[] {});
  }

  @Test(expected = RuntimeException.class)
  public void testNull() {
    Problem8 problem8 = new Problem8();
    problem8.min(null);
  }
}