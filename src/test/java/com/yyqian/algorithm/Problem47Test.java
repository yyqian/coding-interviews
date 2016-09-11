package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem47Test {
  @Test
  public void add() throws Exception {
    assertEquals(37, Problem47.add(21, 16));
    assertEquals(37, Problem47.add(37, 0));
    assertEquals(-37, Problem47.add(-39, 2));
  }

}