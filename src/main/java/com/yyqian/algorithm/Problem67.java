package com.yyqian.algorithm;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem67 {

  private int count;

  public int movingCount(int k, int m, int n) {
    boolean[][] marked = new boolean[m][n];
    count = 0;
    visit(k, 0, 0, m, n, marked);
    return count;
  }

  private void visit(int k, int i, int j, int m, int n, boolean[][] marked) {
    if (i >= 0 && i < m && j >= 0 && j < n
        && !marked[i][j]
        && (digitSum(i) + digitSum(j) <= k)) {
      count++;
      marked[i][j] = true;
      visit(k, i + 1, j, m, n, marked);
      visit(k, i - 1, j, m, n, marked);
      visit(k, i, j + 1, m, n, marked);
      visit(k, i, j - 1, m, n, marked);
    }
  }

  private static int digitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
