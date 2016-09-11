package com.yyqian.algorithm;

import org.junit.Test;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem43Test {
  @Test
  public void probabilityRecursive() throws Exception {
    System.out.println("Recursive solution:");
    Problem43Recursive.probability(2);
  }
  @Test
  public void probabilityIterative() throws Exception {
    System.out.println("Iterative solution:");
    Problem43Iterative.probability(2);
  }

}