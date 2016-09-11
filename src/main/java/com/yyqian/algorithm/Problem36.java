package com.yyqian.algorithm;

/**
 * Created on 2016/9/5.
 *
 * @author Yinyin Qian
 */
public class Problem36 {
  public static int inversePairs(int[] nums) {
    if (nums == null || nums.length < 2) {
      return 0;
    }
    return recur(nums, 0, nums.length - 1);
  }

  private static int recur(int[] nums, int lo, int hi) {
    if (hi - lo < 1) {
      return 0;
    } else {
      int mid = lo + (hi - lo) / 2;
      int leftCount = recur(nums, lo, mid);
      int rightCount = recur(nums, mid + 1, hi);
      return leftCount + rightCount + merge(nums, lo, mid, hi);
    }
  }

  private static int merge(int[] nums, int lo, int mid, int hi) {
    int i = mid;
    int j = hi;
    int lo2 = mid + 1;
    int[] sorted = new int[hi - lo + 1];
    int idx = sorted.length - 1;
    int count = 0;
    while (i >= lo && j >= lo2) {
      if (nums[i] > nums[j]) {
        sorted[idx--] = nums[i--];
        count += j - lo2 + 1;
      } else {
        sorted[idx--] = nums[j--];
      }
    }
    while (i >= lo) {
      sorted[idx--] = nums[i--];
    }
    while (j >= lo2) {
      sorted[idx--] = nums[j--];
    }
    assert idx == -1; // for testing
    System.arraycopy(sorted, 0, nums, lo, sorted.length);
    return count;
  }

}
