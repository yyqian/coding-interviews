package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem41 {
  public static int[] find(int[] nums, int target) {
    int[] result = new int[2];
    if (nums == null || nums.length < 2) {
      return result;
    }
    int lo = 0;
    int hi = nums.length - 1;
    while (lo < hi) {
      if (nums[lo] + nums[hi] > target) {
        hi--;
      } else if (nums[lo] + nums[hi] < target) {
        lo++;
      } else {
        result[0] = nums[lo];
        result[1] = nums[hi];
        break;
      }
    }
    return result;
  }
}
