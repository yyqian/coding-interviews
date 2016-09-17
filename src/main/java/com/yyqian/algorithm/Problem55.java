package com.yyqian.algorithm;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem55 {
  public static char firstNoDup(String str) {
    char[] chars = str.toCharArray();
    final int K = 256;
    int[] dict = new int[K];
    for (int i = 0; i < K; i++) {
      dict[i] = -1;
    }
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (dict[c] == -1) {
        dict[c] = i;
      } else if (dict[c] > -1) {
        dict[c] = -2;
      }
    }
    int minIdx = chars.length - 1;
    for (int i = 0; i < K; i++) {
      if (dict[i] > -1 && dict[i] < minIdx) {
        minIdx = dict[i];
      }
    }
    return chars[minIdx];
  }
}
