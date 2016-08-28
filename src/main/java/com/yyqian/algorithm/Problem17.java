package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem17 {
  public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2) {
    if (head1 == null) {
      return head2;
    } else if (head2 == null) {
      return head1;
    }
    if (head1.val < head2.val) {
      head1.next = merge(head1.next, head2);
      return head1;
    } else {
      head2.next = merge(head1, head2.next);
      return head2;
    }
  }
}
