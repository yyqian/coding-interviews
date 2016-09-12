package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem49Test {
  @Test
  public void atoi() throws Exception {
    assertEquals(123, Problem49.atoi("+123"));
    assertEquals(123, Problem49.atoi("123"));
    assertEquals(-123, Problem49.atoi("-123"));
  }

}