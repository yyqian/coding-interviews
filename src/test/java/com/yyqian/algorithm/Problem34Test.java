package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/30.
 *
 * @author Yinyin Qian
 */
public class Problem34Test {
  @Test
  public void nthUgly() throws Exception {
    assertEquals(1, Problem34.nthUgly(1));
    assertEquals(2, Problem34.nthUgly(2));
    assertEquals(3, Problem34.nthUgly(3));
    assertEquals(4, Problem34.nthUgly(4));
    assertEquals(5, Problem34.nthUgly(5));
    assertEquals(6, Problem34.nthUgly(6));
    assertEquals(8, Problem34.nthUgly(7));
  }

}