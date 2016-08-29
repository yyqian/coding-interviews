package com.yyqian.algorithm;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem29 {
  public static int moreThanHalf(int[] numbers) {
    int count = 1;
    int currnet = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      int n = numbers[i];
      if (count == 0) {
        currnet = n;
        count = 1;
      } else if (n == currnet) {
        count++;
      } else {
        count--;
      }
    }
    return currnet;
  }
}
