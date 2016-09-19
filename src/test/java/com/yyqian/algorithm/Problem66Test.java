package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem66Test {
  @Test
  public void hasPath() throws Exception {
    char[][] matrix = {
        {'a','b','c','e'},
        {'s','f','c','s'},
        {'a','d','e','e'}
    };
    assertTrue(Problem66.hasPath(matrix, "bcced"));
    assertTrue(Problem66.hasPath(matrix, "abce"));
    assertTrue(Problem66.hasPath(matrix, "abcescfsadee"));
    assertTrue(Problem66.hasPath(matrix, "esecbasadecf"));
    assertFalse(Problem66.hasPath(matrix, "abcb"));
  }

}