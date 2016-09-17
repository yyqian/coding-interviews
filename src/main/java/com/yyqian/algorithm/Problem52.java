package com.yyqian.algorithm;

/**
 * Created on 2016/9/16.
 *
 * @author Yinyin Qian
 */
public class Problem52 {
  public static int[] multiply(int[] nums) {
    if (nums == null || nums.length < 2) {
      throw new RuntimeException("Invalid parameters");
    }
    int[] res = new int[nums.length];
    int accum = 1;
    for (int i = 0; i < nums.length; i++) {
      res[i] = accum;
      accum = accum * nums[i];
    }
    accum = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      res[i] *= accum;
      accum = accum * nums[i];
    }
    return res;
  }
}
