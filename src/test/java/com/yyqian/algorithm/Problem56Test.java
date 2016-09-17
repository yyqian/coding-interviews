package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem56Test {
  @Test
  public void meetingNode() throws Exception {
    ListNode<Integer> head = Helper.generateList(new Integer[]{1,2,3,4,5,6});
    head.next.next.next.next.next.next = head.next.next;
    assertEquals(3, Problem56.meetingNode(head).val.intValue());
    head = Helper.generateList(new Integer[] {1,2,3});
    head.next.next.next = head.next;
    assertEquals(2, Problem56.meetingNode(head).val.intValue());
  }

}