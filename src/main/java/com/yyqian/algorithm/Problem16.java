package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem16<T> {
  public ListNode<T> reverseList(ListNode<T> head) {
    ListNode<T> sentinel = new ListNode<T>(null, null);
    while (head != null) {
      ListNode<T> temp = head.next;
      head.next = sentinel.next;
      sentinel.next = head;
      head = temp;
    }
    return sentinel.next;
  }
}
