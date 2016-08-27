package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem10Test {
  @Test
  public void numberOfOne() throws Exception {
    assertEquals(0, Problem10.numberOfOne(0));
    assertEquals(1, Problem10.numberOfOne(1));
    assertEquals(1, Problem10.numberOfOne(0b100));
    assertEquals(2, Problem10.numberOfOne(0b1100));
    assertEquals(3, Problem10.numberOfOne(0b1001010));
    assertEquals(4, Problem10.numberOfOne(0b1011010));
    assertEquals(5, Problem10.numberOfOne(0b11010101));
  }

}