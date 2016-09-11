package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem40Test {
  @Test
  public void find() throws Exception {
    int[] result = Problem40.find(new int[]{2, 4, 3, 6, 3, 2, 5, 5});
    System.out.println(result[0] + " " + result[1]);
  }

}