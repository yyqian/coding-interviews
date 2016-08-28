package com.yyqian.algorithm;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem24 {
  public static boolean verifyPostorder(int[] elements) {
    if (elements == null || elements.length == 0) {
      return false;
    }
    return verify(elements, 0, elements.length - 1);
  }
  private static boolean verify(int[] elements, int lo, int hi) {
    if (lo == hi) {
      return true;
    }
    int rightHead = lo;
    for (; rightHead <= hi - 1; rightHead++) {
      if (elements[rightHead] > elements[hi]) {
        break;
      }
    }
    for (int i = rightHead + 1; i <= hi - 1; i++) {
      if (elements[i] < elements[hi]) {
        return false;
      }
    }
    boolean result = true;
    if (rightHead < hi) {
      result = result && verify(elements, rightHead, hi - 1);
    }
    if (rightHead > lo) {
      result = result && verify(elements, lo, rightHead -1);
    }
    return result;
  }
}
