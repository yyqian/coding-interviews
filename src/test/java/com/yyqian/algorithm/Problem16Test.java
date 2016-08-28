package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem16Test {
  @Test
  public void reverseList() throws Exception {
    Problem16<Integer> problem16 = new Problem16<>();
    ListNode<Integer> head = new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, null)));
    head = problem16.reverseList(head);
    assertEquals(3, head.val.intValue());
    assertEquals(2, head.next.val.intValue());
    assertEquals(1, head.next.next.val.intValue());
    assertNull(head.next.next.next);
  }

}