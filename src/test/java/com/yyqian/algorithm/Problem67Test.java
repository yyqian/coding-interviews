package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem67Test {
  @Test
  public void movingCount() throws Exception {
    Problem67 problem67 = new Problem67();
    assertEquals(1, problem67.movingCount(0,5,5));
    assertEquals(3, problem67.movingCount(1,5,5));
    assertEquals(6, problem67.movingCount(2,5,5));
  }

}