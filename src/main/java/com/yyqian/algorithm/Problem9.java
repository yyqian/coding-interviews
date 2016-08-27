package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem9 {
  public static int fib(int n) {
    if (n < 0) {
      throw new RuntimeException("Invalid paramter");
    } else if (n < 2) {
      return n;
    }
    int prev2 = 0;
    int prev1 = 1;
    for (int i = 2; i <= n; i++) {
      int current = prev1 + prev2;
      prev2 = prev1;
      prev1 = current;
    }
    return prev1;
  }
}
