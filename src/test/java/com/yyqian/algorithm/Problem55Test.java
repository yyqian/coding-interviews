package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem55Test {
  @Test
  public void firstNoDup() throws Exception {
    assertEquals('g', Problem55.firstNoDup("go"));
    assertEquals('l', Problem55.firstNoDup("google"));
    assertEquals('e', Problem55.firstNoDup("gologle"));
    assertEquals('e', Problem55.firstNoDup("e"));
  }

}