package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem38 {
  public static int getNumberOfK(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int first = getFirstK(nums, k);
    int last = getLastK(nums, k);
    if (first < 0 || last < 0) {
      return 0;
    } else {
      return last - first + 1;
    }
  }

  private static int getFirstK(int[] nums, int k) {
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] > k) {
        hi = mid - 1;
      } else if (nums[mid] < k) {
        lo = mid + 1;
      } else {
        if (mid == 0 || nums[mid - 1] != k) {
          return mid;
        } else {
          hi = mid - 1;
        }
      }
    }
    return -1;
  }

  private static int getLastK(int[] nums, int k) {
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] > k) {
        hi = mid - 1;
      } else if (nums[mid] < k) {
        lo = mid + 1;
      } else {
        if (mid == hi || nums[mid + 1] != k) {
          return mid;
        } else {
          lo = mid + 1;
        }
      }
    }
    return -1;
  }
}
