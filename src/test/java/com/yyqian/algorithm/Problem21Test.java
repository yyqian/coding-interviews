package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem21Test {
  @Test
  public void all() throws Exception {
    Problem21 stack = new Problem21();
    stack.push(3);
    stack.push(4);
    stack.push(2);
    stack.push(1);
    assertEquals(1, stack.min());
    assertEquals(1, stack.pop());
    assertEquals(2, stack.min());
    stack.push(5);
    assertEquals(2, stack.min());
  }

}