package com.yyqian.algorithm;

/**
 * Created on 9/16/16.
 *
 * @author Yinyin Qian
 */
public class Problem51 {
  public static int duplicate(int[] nums) {
    if (nums == null || nums.length < 2) {
      return -1;
    }
    for (int i = 0; i < nums.length; i++) {
      while (i != nums[i]) {
        int j = nums[i];
        if (nums[i] == nums[j]) {
          return nums[i];
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
    return -1;
  }
}
