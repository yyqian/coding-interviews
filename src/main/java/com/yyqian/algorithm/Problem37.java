package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem37<T> {
  public ListNode<T> commonNode(ListNode<T> head1, ListNode<T> head2) {
    ListNode<T> pointer1 = head1;
    ListNode<T> pointer2 = head2;
    while (pointer1 != pointer2) {
      pointer1 = (pointer1.next == null) ? head2 : pointer1.next;
      pointer2 = (pointer2.next == null) ? head1 : pointer2.next;
    }
    return pointer1;
  }
}
