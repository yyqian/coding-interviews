package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem3Test {

  @Test
  public void testSearchMatrix() throws Exception {
    Problem3Recursive problem3Recursive = new Problem3Recursive();
    Problem3Iterative problem3Iterative = new Problem3Iterative();
    int[][] matrix = new int[][]{
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };
    for (int[] row : matrix) {
      for (int element : row) {
        assertTrue(problem3Recursive.searchMatrix(matrix, element));
        assertTrue(problem3Iterative.searchMatrix(matrix, element));
      }
    }
    int[] testFalseSets = {20, 100, 293, 4885, 3245435, 32423, -324, -43453, Integer.MAX_VALUE, Integer.MIN_VALUE};
    for (int element : testFalseSets) {
      assertFalse(problem3Recursive.searchMatrix(matrix, element));
      assertFalse(problem3Iterative.searchMatrix(matrix, element));
    }
    assertFalse(problem3Iterative.searchMatrix(null, 3));
    assertFalse(problem3Recursive.searchMatrix(null, 3));
    assertFalse(problem3Iterative.searchMatrix(new int[][] {}, 3));
    assertFalse(problem3Recursive.searchMatrix(new int[][] {}, 3));
    assertFalse(problem3Iterative.searchMatrix(new int[][] {{}}, 3));
    assertFalse(problem3Recursive.searchMatrix(new int[][] {{}}, 3));
  }

}