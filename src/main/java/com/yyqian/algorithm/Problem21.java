package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created on 2016/8/28.
 *
 * @author Yinyin Qian
 */
public class Problem21 {
  private Deque<Integer> stack = new ArrayDeque<>();
  private Deque<Integer> minStack = new ArrayDeque<>();

  public void push(int element) {
    stack.push(element);
    if (minStack.isEmpty() || element < minStack.peek()) {
      minStack.push(element);
    } else {
      minStack.push(minStack.peek());
    }
  }
  public int pop() {
    minStack.pop();
    return stack.pop();
  }
  public int min() {
    return minStack.peek();
  }
}
