package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem5Iterative {
  public static void print(ListNode<Integer> head) {
    Deque<ListNode<Integer>> stack = new ArrayDeque<>();
    while (head != null) {
      stack.push(head);
      head = head.next;
    }
    while (!stack.isEmpty()) {
      System.out.println(stack.pop().val);
    }
  }
}
