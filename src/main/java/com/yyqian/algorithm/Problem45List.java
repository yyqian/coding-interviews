package com.yyqian.algorithm;

/**
 * Created on 9/12/16.
 *
 * @author Yinyin Qian
 */
public class Problem45List {
  public static int last(int n, int m) {
    if (n < 1 || m < 1) {
      throw new RuntimeException("Invalid parameters");
    }
    ListNode<Integer> head = buildLoop(n);
    while (head.next != head) {
      for (int i = 0; i < m - 1; i++) {
        head = head.next;
      }
      head = delete(head);
    }
    return head.val;
  }

  private static ListNode<Integer> buildLoop(int n) {
    ListNode<Integer> sentinel = new ListNode<>(null, null);
    ListNode<Integer> current = sentinel;
    for (int i = 0; i < n; i++) {
      current.next = new ListNode<>(i, null);
      current = current.next;
    }
    current.next = sentinel.next;
    return sentinel.next;
  }

  private static <T> ListNode<T> delete(ListNode<T> toDelete) {
    toDelete.val = toDelete.next.val;
    toDelete.next = toDelete.next.next;
    return toDelete;
  }
}
