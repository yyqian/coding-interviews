package com.yyqian.algorithm;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem30 {
  public static int[] topK(int[] numbers, int k) {
    int lo = 0;
    int hi = numbers.length - 1;
    int idx = partition(numbers, lo, hi);
    while (idx != k - 1) {
      if (idx < k - 1) {
        lo = idx + 1;
        idx = partition(numbers, lo, hi);
      } else {
        hi = idx - 1;
        idx = partition(numbers, lo, hi);
      }
    }
    int[] result = new int[k];
    System.arraycopy(numbers, 0, result, 0, k);
    return result;
  }
  // 这个函数要直接背出来，比较 tricky
  private static int partition(int[] numbers, int lo, int hi) {
    if (lo > hi) {
      throw new RuntimeException("Invalid lo and hi");
    }
    if (lo == hi) {
      return lo;
    }
    int target = numbers[lo];
    int i = lo;
    int j = hi + 1;
    while (true) {
      while (numbers[++i] < target) {
        if (i == hi) break;
      }
      while (numbers[--j] > target) {
        if (j == lo) break;
      }
      if (i >= j) break;
      exch(numbers, i, j);
    }
    exch(numbers, lo, j);
    return j;
  }
  private static void exch(int[] numbers, int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
