package com.yyqian.algorithm;

/**
 * Created on 2016/8/31.
 *
 * @author Yinyin Qian
 */
public class Problem35 {
  public static char search(String str) {
    char[] chars = str.toCharArray();
    int[] bucket = new int[256];
    for (char c : chars) {
      bucket[c]++;
    }
    for (int i = 0; i < 256; i++) {
      if (bucket[i] == 1) {
        return (char)i;
      }
    }
    return 0;
  }
}
