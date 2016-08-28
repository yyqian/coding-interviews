package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem11Test {
  @Test
  public void power() throws Exception {
    double epsilon = 1e-6;
    assertEquals(1.1, Problem11.power(1.1, 1), epsilon);
    assertEquals(1.21, Problem11.power(1.1, 2), epsilon);
    assertEquals(0.25, Problem11.power(2, -2), epsilon);
    assertEquals(1, Problem11.power(2, 0), epsilon);
    assertEquals(0, Problem11.power(0, 3), epsilon);
  }

  @Test(expected = RuntimeException.class)
  public void testZero() {
    Problem11.power(0, -2);
  }
}