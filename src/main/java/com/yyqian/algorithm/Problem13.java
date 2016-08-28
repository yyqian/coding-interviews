package com.yyqian.algorithm;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem13 {
  public static void delete(ListNode<Integer> head, ListNode<Integer> toBeDeleted) {
    if (toBeDeleted == null || head == null) {
      return;
    } else if (toBeDeleted.next == null) {
      ListNode<Integer> node = head;
      while (node.next != toBeDeleted) {
        node = node.next;
      }
      node.next = null;
      return;
    }
    ListNode<Integer> nextNode = toBeDeleted.next;
    toBeDeleted.val = nextNode.val;
    toBeDeleted.next = nextNode.next;
    nextNode.next = null;
  }
}
