package com.yyqian.algorithm;

import java.util.NoSuchElementException;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem15 {
  public static ListNode<Integer> findKthToTail(ListNode<Integer> head, int k) {
    if (head == null || k < 1) {
      return null;
    }
    ListNode<Integer> pointer1 = head;
    for (int i = 0; i < k; i++) {
      if (pointer1 == null) {
        return null;
      }
      pointer1 = pointer1.next;
    }
    ListNode<Integer> pointer2 = head;
    while (pointer1 != null) {
      pointer1 = pointer1.next;
      pointer2 = pointer2.next;
    }
    return pointer2;
  }
}
