package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Helper {
  public static <T> ListNode<T> generateList(T[] elements) {
    ListNode<T> sentinel = new ListNode<>(null, null);
    ListNode<T> tail = sentinel;
    for (T x: elements) {
      tail.next = new ListNode<>(x, null);
      tail = tail.next;
    }
    return sentinel.next;
  }
}
