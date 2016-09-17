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

  @Override
  public String toString() {
    ListNode<T> current = this;
    StringBuilder sb = new StringBuilder();
    while (current.next != null) {
      sb.append(current.val);
      sb.append("->");
      current = current.next;
    }
    sb.append(current.val);
    return sb.toString();
  }
}
