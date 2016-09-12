package com.yyqian.algorithm;

import java.util.Arrays;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem44 {
  public static boolean isContinuous(int[] nums) {
    if (nums == null || nums.length != 5) {
      return false;
    }
    int len = nums.length;
    Arrays.sort(nums);
    int zeros = 0;
    int idx = 0;
    for (; idx < len; idx++) {
      if (nums[idx] != 0) {
        break;
      }
      zeros++;
    }
    int holes = 0;
    for (idx++; idx < len; idx++) {
      if (nums[idx] == nums[idx - 1]) {
        return false;
      }
      holes += nums[idx] - nums[idx - 1] - 1;
    }
    return holes <= zeros;
  }
}
