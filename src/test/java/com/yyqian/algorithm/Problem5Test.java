package com.yyqian.algorithm;

import org.junit.Test;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem5Test {

  @Test
  public void testPrint() throws Exception {
    ListNode<Integer> head = prepareList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    // check the output in console, not automatically
    Problem5Recursive.print(head);
    Problem5Iterative.print(head);
    Problem5Recursive.print(null);
    Problem5Iterative.print(null);
  }

  private ListNode<Integer> prepareList(int[] ary) {
    ListNode<Integer> sentinel = new ListNode<>(0, null);
    ListNode<Integer> current = sentinel;
    for (int element : ary) {
      current.next = new ListNode<>(element, null);
      current = current.next;
    }
    return sentinel.next;
  }
}