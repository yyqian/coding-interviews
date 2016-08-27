package com.yyqian.algorithm;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created on 8/28/16.
 *
 * @author Yinyin Qian
 */
public class Problem7Stack {
  private Queue<Integer> queue1 = new LinkedList<>();
  private Queue<Integer> queue2 = new LinkedList<>();

  public void push(int element) {
    queue1.offer(element);
  }

  public int pop() {
    if (queue1.isEmpty() && queue2.isEmpty()) {
      throw new NoSuchElementException("The stack is empty.");
    }
    Queue<Integer> source = queue1.isEmpty() ? queue2 : queue1;
    Queue<Integer> target = queue1.isEmpty() ? queue1 : queue2;
    while (source.size() > 1) {
      target.offer(source.poll());
    }
    return source.poll();
  }
}
