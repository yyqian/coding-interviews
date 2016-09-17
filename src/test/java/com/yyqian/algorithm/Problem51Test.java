package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/9/16.
 *
 * @author Yinyin Qian
 */
public class Problem51Test {
  @Test
  public void duplicate() throws Exception {
    assertEquals(2, Problem51.duplicate(new int[]{2,3,1,0,2,5,4}));
    assertEquals(4, Problem51.duplicate(new int[]{4,3,1,0,2,5,4}));
  }

}