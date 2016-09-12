package com.yyqian.algorithm;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem45Analytic {
  public static int last(int n, int m) {
    if (n < 1 || m < 1) {
      throw new RuntimeException("Invalid parameters");
    }
    int last = 0;
    for (int i = 2; i <= n; i++) {
      last = (last + m) % i;
    }
    return last;
  }
}
