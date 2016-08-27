package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem3Recursive {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    return search(matrix, target, 0, matrix[0].length - 1);
  }

  private boolean search(int[][] matrix, int target, int top, int right) {
    if (top >= matrix.length || right < 0) {
      return false;
    }
    if (target == matrix[top][right]) {
      return true;
    } else if (target < matrix[top][right]) {
      return search(matrix, target, top, right - 1);
    } else {
      return search(matrix, target, top + 1, right);
    }
  }
}
