package com.yyqian.algorithm;


/**
 * Created on 2016/8/30.
 *
 * @author Yinyin Qian
 */
public class Problem34 {
  public static int nthUgly(int n) {
    int[] ugly = new int[n];
    ugly[0] = 1;
    // idx 指向下一个可以乘的丑数的下标
    int idx2 = 0;
    int idx3 = 0;
    int idx5 = 0;
    int mul2, mul3, mul5;
    for (int i = 1; i < n; i++) {
      mul2 = ugly[idx2] * 2;
      mul3 = ugly[idx3] * 3;
      mul5 = ugly[idx5] * 5;
      ugly[i] = min(mul2, mul3, mul5);
      if (ugly[i] == mul2) idx2++;
      if (ugly[i] == mul3) idx3++;
      if (ugly[i] == mul5) idx5++;
    }
    return ugly[n-1];
  }

  private static int min(int i, int j, int k) {
    return Math.min(i, Math.min(j, k));
  }
}
