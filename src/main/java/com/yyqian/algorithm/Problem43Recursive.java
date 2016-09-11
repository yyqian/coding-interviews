package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem43Recursive {
  public static void probability(int n) {
    for (int s = n; s <= 6 * n; s++) {
      System.out.println("P(s = " + s + ") = " + p(n, s));
    }
  }

  private static double p(int n, int s) {
    if (s < n || s > 6 * n) {
      return 0.0;
    }
    if (n == 1) {
      return 1.0 / 6.0;
    } else {
      double result = 0.0;
      for (int i = 1; i <= 6; i++) {
        result += p(n - 1, s - i);
      }
      return result / 6.0;
    }
  }
}
