package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem43Iterative {
  public static void probability(int n) {
    double[][] p = new double[n + 1][6 * n + 1];
    for (int i = 1; i <= 6; i++) {
      p[1][i] = 1.0 / 6.0;
    }
    for (int k = 2; k <= n; k++) {
      for (int s = k; s <= 6 * k; s++) {
        p[k][s] = 0.0;
        for (int i = 1; i <= 6; i++) {
          if (isValid(k - 1, s - i)) p[k][s] += p[k - 1][s - i];
        }
        p[k][s] /= 6.0;
      }
    }
    for (int s = n; s <= 6 * n; s++) {
      System.out.println("P(s = " + s + ") = " + p[n][s]);
    }
  }

  private static boolean isValid(int k, int s) {
    return (s >= k) && (s <= 6 * k);
  }

}
