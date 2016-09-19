package com.yyqian.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem65 {

  public static int[] maxInWindow(int[] nums, int k) {
    QueueWithMaxB<Integer> queue = new QueueWithMaxB<>();
    //QueueWithMax<Integer> queue = new QueueWithMax<>();
    int[] res = new int[nums.length - k + 1];
    for (int i = 0; i < k; i++) {
      queue.offer(nums[i]);
    }
    res[0] = queue.max();
    for (int i = k; i < nums.length; i++) {
      queue.poll();
      queue.offer(nums[i]);
      res[i - k + 1] = queue.max();
    }
    return res;
  }

  public static class QueueWithMax<T extends Comparable<T>> {
    private StackWithMax<T> stack1 = new StackWithMax<>();
    private StackWithMax<T> stack2 = new StackWithMax<>();
    public void offer(T element) {
      stack1.push(element);
    }
    public T poll() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.pop();
    }
    public T max() {
      if (stack1.isEmpty()) {
        return stack2.max();
      } else if (stack2.isEmpty()) {
        return stack1.max();
      } else {
        return stack1.max().compareTo(stack2.max()) > 0 ? stack1.max() : stack2.max();
      }
    }
  }

  private static class StackWithMax<T extends Comparable<T>> {
    private Deque<T> stack = new ArrayDeque<>();
    private Deque<T> maxStack = new ArrayDeque<>();

    public void push(T element) {
      stack.push(element);
      if (maxStack.isEmpty() || element.compareTo(maxStack.peek()) > 0) {
        maxStack.push(element);
      } else {
        maxStack.push(maxStack.peek());
      }
    }

    public T pop() {
      maxStack.pop();
      return stack.pop();
    }

    public T max() {
      return maxStack.peek();
    }

    public boolean isEmpty() {
      return stack.isEmpty();
    }
  }

  // Solution 2
  public static class QueueWithMaxB<T extends Comparable<T>> {
    Queue<T> queue = new LinkedList<>();
    Deque<T> maxDeque = new ArrayDeque<>();
    public void offer(T element) {
      queue.offer(element);
      while (!maxDeque.isEmpty() && maxDeque.getLast().compareTo(element) < 0) {
        maxDeque.removeLast();
      }
      maxDeque.addLast(element);
    }
    public T poll() {
      T element = queue.poll();
      if (maxDeque.getFirst() == element) {
        maxDeque.removeFirst();
      }
      return element;
    }
    public T max() {
      return maxDeque.getFirst();
    }
  }

}
