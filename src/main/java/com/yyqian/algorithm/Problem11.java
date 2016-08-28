package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem11 {
  public static double power(double base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else if (exponent < 0) {
      if (base == 0) {
        throw new RuntimeException("Invalid parameters");
      } else {
        return 1 / power(base, -exponent);
      }
    } else {
      if (exponent % 2 == 0) {
        double half = power(base, exponent / 2);
        return half * half;
      } else {
        double half = power(base, (exponent - 1) / 2);
        return base * half * half;
      }
    }
  }
}
