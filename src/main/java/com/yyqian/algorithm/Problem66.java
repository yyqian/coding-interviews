package com.yyqian.algorithm;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem66 {
  public static boolean hasPath(char[][] matrix, String word) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    boolean[][] marked = new boolean[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (visit(matrix, i, j, word, marked)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean visit(char[][] matrix, int row, int col, String word, boolean[][] marked) {
    if (word.length() == 0) {
      return true;
    }
    if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || marked[row][col] || matrix[row][col] != word.charAt(0)) {
      return false;
    }
    marked[row][col] = true;
    String substring = word.substring(1);
    boolean res = visit(matrix, row + 1, col, substring, marked);
    if (!res) {
      res = visit(matrix, row - 1, col, substring, marked);
    }
    if (!res) {
      res = visit(matrix, row, col + 1, substring, marked);
    }
    if (!res) {
      res = visit(matrix, row, col - 1, substring, marked);
    }
    marked[row][col] = false;
    return res;
  }
}
