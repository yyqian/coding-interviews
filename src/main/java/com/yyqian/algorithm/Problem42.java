package com.yyqian.algorithm;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem42 {
  public static String reverse(String str) {
    return Arrays.stream(reverseAll(str).split(" "))
        .map(Problem42::reverseAll)
        .collect(Collectors.joining(" "));
  }

  public static String reverseAll(String str) {
    char[] chars = str.toCharArray();
    int lo = 0;
    int hi = chars.length - 1;
    while (lo < hi) {
      char temp = chars[lo];
      chars[lo++] = chars[hi];
      chars[hi--] = temp;
    }
    return new String(chars);
  }
}
