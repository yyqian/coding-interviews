package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem14Test {
  @Test
  public void reorder() throws Exception {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    Problem14.reorder(numbers);
    for (int i = 0; i < 4; i++) {
      assertFalse(isEven(numbers[i]));
    }
    for (int i = 4; i < 8; i++) {
      assertTrue(isEven(numbers[i]));
    }
  }

  private boolean isEven(int n) {
    return (n & 0b1) == 0;
  }

}