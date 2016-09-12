package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class ListNode<T> {
  T val;
  ListNode<T> next;

  public ListNode(T val, ListNode<T> next) {
    this.val = val;
    this.next = next;
  }

  public ListNode(T val) {
    this(val, null);
  }
}
