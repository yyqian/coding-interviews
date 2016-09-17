package com.yyqian.algorithm;

/**
 * Created on 9/17/16.
 *
 * @author Yinyin Qian
 */
public class Problem56 {
  public static <T> ListNode<T> meetingNode(ListNode<T> head) {
    ListNode<T> walker = head;
    ListNode<T> runner = head.next;
    while (walker != runner) {
      walker = walker.next;
      runner = runner.next.next;
    }
    int count = 1;
    walker = walker.next;
    while (walker != runner) {
      walker = walker.next;
      count++;
    }
    walker = head;
    runner = head;
    for (int i = 0; i < count; i++) {
      runner = runner.next;
    }
    while (walker != runner) {
      walker = walker.next;
      runner = runner.next;
    }
    return walker;
  }
}
