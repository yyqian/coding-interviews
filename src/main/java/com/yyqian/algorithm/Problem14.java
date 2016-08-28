package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem14 {
  public static void reorder(int[] numbers) {
    if (numbers == null || numbers.length < 2) {
      return;
    }
    int lo = 0;
    int hi = numbers.length - 1;
    while (lo < hi) {
      while (lo < hi && !split(numbers[lo])) {
        lo++;
      }
      while (lo < hi && split(numbers[hi])) {
        hi--;
      }
      if (lo < hi) {
        swap(numbers, lo, hi);
      }
    }
  }

  private static boolean split(int n) {
    return (n & 0b1) == 0;
  }

  private static void swap(int[] numbers, int idx1, int idx2) {
    int temp = numbers[idx1];
    numbers[idx1] = numbers[idx2];
    numbers[idx2] = temp;
  }
}
