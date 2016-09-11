package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem40 {
  public static int[] find(int[] nums) {
    if (nums == null || nums.length < 2) {
      return null;
    }
    int[] result = {0, 0};
    int xor = 0;
    for (int x: nums) {
      xor ^= x;
    }
    int firstOne = ~(xor - 1) & xor;
    for (int x: nums) {
      if ((x & firstOne) == 0) {
        result[0] ^= x;
      } else {
        result[1] ^= x;
      }
    }
    return result;
  }
}
