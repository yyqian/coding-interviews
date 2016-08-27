package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem9Test {
  @Test
  public void testFib() throws Exception {
    assertEquals(0, Problem9.fib(0));
    assertEquals(1, Problem9.fib(1));
    assertEquals(1, Problem9.fib(2));
    assertEquals(2, Problem9.fib(3));
    assertEquals(3, Problem9.fib(4));
    assertEquals(5, Problem9.fib(5));
    assertEquals(8, Problem9.fib(6));
    assertEquals(13, Problem9.fib(7));
  }

  @Test(expected = RuntimeException.class)
  public void testBadInput() {
    Problem9.fib(-1);
  }

}