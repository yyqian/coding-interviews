package com.yyqian.algorithm;

/**
 * Created on 2016/8/30.
 *
 * @author Yinyin Qian
 */
public class Problem31 {
  public static int maxSum(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new RuntimeException("Invalid numbers");
    }
    int max = numbers[0];
    int current = 0;
    for (int n: numbers) {
      current += n;
      if (current < 0) {
        current = 0;
      } else if (current > max) {
        max = current;
      }
    }
    return max;
  }
}
