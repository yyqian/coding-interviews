package com.yyqian.algorithm;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem57 {
  public static <T> ListNode<T> deleteDuplication(ListNode<T> head) {
    ListNode<T> sentinel = new ListNode<>(null);
    sentinel.next = head;
    ListNode<T> current = sentinel;
    while (current.next != null && current.next.next != null) {
      if (current.next.val == current.next.next.val) {
        ListNode<T> lastDup = current.next.next;
        while (lastDup.next != null && lastDup.next.val == lastDup.val) {
          lastDup = lastDup.next;
        }
        current.next = lastDup.next;
      } else {
        current = current.next;
      }
    }
    return sentinel.next;
  }
}
