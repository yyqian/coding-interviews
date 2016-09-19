package com.yyqian.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem64Test {
  @Test
  public void streamMedian() throws Exception {
    assertEquals(1, Problem64.streamMedian(new int[]{1})[0], 1e-5);
    assertEquals(3, Problem64.streamMedian(new int[]{3})[0], 1e-5);
    assertEquals(2, Problem64.streamMedian(new int[]{2, 100})[0], 1e-5);
    assertEquals(51, Problem64.streamMedian(new int[]{2, 100})[1], 1e-5);
    assertEquals(10, Problem64.streamMedian(new int[]{100, 1, 10})[2], 1e-5);
    Arrays.stream(Problem64.streamMedian(new int[]{3,1,4,5,2,7})).forEach(System.out::println);
  }

}