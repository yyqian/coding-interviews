package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem37Test {
  @Test
  public void commonNode() throws Exception {
    Problem37<Integer> problem37 = new Problem37<>();
    ListNode<Integer> head1 = Helper.generateList(new Integer[] {1, 2, 3, 4, 5});
    ListNode<Integer> head2 = new ListNode<>(6, new ListNode<>(7, head1.next.next));
    ListNode<Integer> res = problem37.commonNode(head1, head2);
    assertEquals(3, res.val.intValue());
  }

}