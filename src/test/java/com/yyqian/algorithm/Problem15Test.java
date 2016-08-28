package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem15Test {
  @Test
  public void findKthToTail() throws Exception {
    ListNode<Integer> head = new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, null)));
    assertEquals(3, Problem15.findKthToTail(head, 1).val.intValue());
    assertEquals(2, Problem15.findKthToTail(head, 2).val.intValue());
    assertEquals(1, Problem15.findKthToTail(head, 3).val.intValue());
    assertNull(Problem15.findKthToTail(head, 0));
    assertNull(Problem15.findKthToTail(head, -2));
    assertNull(Problem15.findKthToTail(null, 2));
    assertNull(Problem15.findKthToTail(null, -2));
  }

}