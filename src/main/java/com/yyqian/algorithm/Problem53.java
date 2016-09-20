package com.yyqian.algorithm;

/**
 * Created on 9/20/16.
 *
 * @author Yinyin Qian
 */
public class Problem53 {
  public static boolean match (String str, String pattern) {
    if (str == null || pattern == null) {
      return false;
    }
    if (str.length() == 0 || pattern.length() == 0) {
      return str.length() == pattern.length();
    }
    if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
      return ((pattern.charAt(0) == '.' || pattern.charAt(0) == str.charAt(0)) && match(str.substring(1), pattern))
          || match(str, pattern.substring(2));
    }
    return (pattern.charAt(0) == '.' || pattern.charAt(0) == str.charAt(0))
        && match(str.substring(1), pattern.substring(1));
  }
}
