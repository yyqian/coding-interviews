package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem5Recursive {

  public static void print(ListNode<Integer> head) {
    if (head == null) {
      return;
    }
    print(head.next);
    System.out.println(head.val);
  }
}
