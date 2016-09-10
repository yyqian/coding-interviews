package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/31.
 *
 * @author Yinyin Qian
 */
public class Problem35Test {
  @Test
  public void search() throws Exception {
    assertEquals('b', Problem35.search("abaccdeff"));
    assertEquals('d', Problem35.search("abacbcdeff"));
  }

}