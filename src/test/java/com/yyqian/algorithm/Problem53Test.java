package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/20/16.
 *
 * @author Yinyin Qian
 */
public class Problem53Test {
  @Test
  public void match() throws Exception {
    assertTrue(Problem53.match("aaa", "a.a"));
    assertTrue(Problem53.match("aaa", "ab*ac*a"));
    assertFalse(Problem53.match("aaa", "aa.a"));
    assertFalse(Problem53.match("aaa", "ab*a"));
  }

}