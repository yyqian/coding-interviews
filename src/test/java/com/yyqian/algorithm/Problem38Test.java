package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem38Test {
  @Test
  public void getNumberOfK() throws Exception {
    int[] nums = {1, 2, 2, 3, 3, 3, 3, 4, 5};
    assertEquals(4, Problem38.getNumberOfK(nums, 3));
    assertEquals(2, Problem38.getNumberOfK(nums, 2));
    assertEquals(1, Problem38.getNumberOfK(nums, 4));
    assertEquals(1, Problem38.getNumberOfK(nums, 1));
    assertEquals(1, Problem38.getNumberOfK(nums, 5));
    assertEquals(0, Problem38.getNumberOfK(nums, 6));
    assertEquals(0, Problem38.getNumberOfK(new int[]{}, 6));
    assertEquals(0, Problem38.getNumberOfK(null, 6));
  }

}