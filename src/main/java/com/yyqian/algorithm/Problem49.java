package com.yyqian.algorithm;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem49 {
  public static int atoi(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int idx = 0;
    int sign = 1;
    if (chars[0] == '+') {
      sign = 1;
      idx++;
    } else if (chars[0] == '-') {
      sign = -1;
      idx++;
    }
    int result = 0;
    for (;idx < chars.length; idx++) {
      result = result * 10 + (chars[idx] - '0');
    }
    return sign * result;
  }
}
