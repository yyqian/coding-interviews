package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem17Test {
  @Test
  public void merge() throws Exception {
    ListNode<Integer> list1 = new ListNode<>(1, new ListNode<>(3, new ListNode<>(5, new ListNode<>(7, null))));
    ListNode<Integer> list2 = new ListNode<>(2, new ListNode<>(4, new ListNode<>(6, new ListNode<>(8, null))));
    ListNode<Integer> head = Problem17.merge(list1, list2);
    int count = 0;
    while (head != null) {
      count++;
      assertEquals(count, head.val.intValue());
      head = head.next;
    }
  }

}