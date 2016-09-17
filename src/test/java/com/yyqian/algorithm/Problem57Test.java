package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem57Test {
  @Test
  public void deleteDuplication() throws Exception {
    ListNode<Integer> head = Helper.generateList(new Integer[] {1,2,3,3,3,4,5,5});
    head = Problem57.deleteDuplication(head);
    assertEquals(1, head.val.intValue());
    assertEquals(2, head.next.val.intValue());
    assertEquals(4, head.next.next.val.intValue());
    assertNull(head.next.next.next);
  }

}