package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem42b {
  public static String reverse(String str, int i) {
    String str1 = Problem42.reverseAll(str.substring(0, i));
    String str2 = Problem42.reverseAll(str.substring(i));
    return Problem42.reverseAll(str1 + str2);
  }
}
