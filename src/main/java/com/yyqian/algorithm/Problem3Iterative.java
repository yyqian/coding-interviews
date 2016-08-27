package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem3Iterative {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int top = 0;
    int right = matrix[0].length - 1;
    while (top < matrix.length && right >= 0) {
      if (target == matrix[top][right]) {
        return true;
      } else if (target < matrix[top][right]) {
        right--;
      } else {
        top++;
      }
    }
    return false;
  }
}
