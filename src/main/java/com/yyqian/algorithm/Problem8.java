package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem8 {
  public int min(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new RuntimeException("Invalid numbers");
    }
    if (numbers.length == 1) {
      return numbers[0];
    }
    int lo = 0;
    int hi = numbers.length - 1;
    int mid = lo;
    while (numbers[lo] >= numbers[hi]) {
      if (hi - lo == 1) {
        mid = hi;
        break;
      }
      mid = lo + (hi - lo) / 2;
      if (numbers[lo] == numbers[hi] && numbers[lo] == numbers[mid]) {
        return minInOrder(numbers, lo, hi);
      }
      if (numbers[mid] >= numbers[lo]) {
        lo = mid;
      } else if (numbers[mid] <= numbers[hi]) {
        hi = mid;
      }
    }
    return numbers[mid];
  }

  // search in order
  private int minInOrder(int[] numbers, int lo, int hi) {
    int result = numbers[lo];
    for (int i = lo + 1; i <= hi; i++) {
      if (numbers[i] < result) {
        result = numbers[i];
      }
    }
    return result;
  }
}
