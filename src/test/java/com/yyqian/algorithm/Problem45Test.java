package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem45Test {
  @Test
  public void last() throws Exception {
    assertEquals(3, Problem45List.last(5, 3));
    assertEquals(3, Problem45Analytic.last(5, 3));
    assertEquals(4, Problem45List.last(5, 1));
    assertEquals(4, Problem45Analytic.last(5, 1));
    assertEquals(2, Problem45List.last(5, 2));
    assertEquals(2, Problem45Analytic.last(5, 2));
    assertEquals(1, Problem45List.last(2, 1));
    assertEquals(1, Problem45Analytic.last(2, 1));
    assertEquals(0, Problem45List.last(2, 2));
    assertEquals(0, Problem45Analytic.last(2, 2));
  }

}