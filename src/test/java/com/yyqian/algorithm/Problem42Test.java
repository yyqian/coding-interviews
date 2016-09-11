package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem42Test {
  @Test
  public void reverse() throws Exception {
    assertEquals("student. a am I", Problem42.reverse("I am a student."));
  }

  @Test
  public void reverseB() throws Exception {
    assertEquals("cdefgab", Problem42b.reverse("abcdefg", 2));
    assertEquals("defgabc", Problem42b.reverse("abcdefg", 3));
    assertEquals("efgabcd", Problem42b.reverse("abcdefg", 4));
  }

}