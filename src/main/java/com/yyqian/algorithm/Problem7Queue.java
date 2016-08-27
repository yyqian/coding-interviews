package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem7Queue {
  private Deque<Integer> stack1 = new ArrayDeque<>();
  private Deque<Integer> stack2 = new ArrayDeque<>();

  public void offer(int element) {
    stack1.push(element);
  }

  public int poll() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    if (stack2.isEmpty()) {
      throw new NoSuchElementException("The queue is empty.");
    }
    return stack2.pop();
  }
}
