package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem10 {
  public static int numberOfOne(int n) {
    int count = 0;
    while (n != 0) {
      count++;
      n = n & (n - 1);
    }
    return count;
  }
}
