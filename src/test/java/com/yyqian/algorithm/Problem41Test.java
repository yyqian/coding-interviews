package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem41Test {
  @Test
  public void find() throws Exception {
    int[] result = Problem41.find(new int[]{1, 2, 4, 7, 11, 15}, 15);
    assertEquals(4, result[0]);
    assertEquals(11, result[1]);
  }

}