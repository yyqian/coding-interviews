package com.yyqian.algorithm;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem7Test {

  @Test(expected = NoSuchElementException.class)
  public void testQueue() throws Exception {
    Problem7Queue queue = new Problem7Queue();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    assertEquals(1, queue.poll());
    assertEquals(2, queue.poll());
    queue.offer(4);
    assertEquals(3, queue.poll());
    assertEquals(4, queue.poll());
    queue.poll();
  }

  @Test(expected = NoSuchElementException.class)
  public void testStack() {
    Problem7Stack stack = new Problem7Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    assertEquals(3, stack.pop());
    assertEquals(2, stack.pop());
    stack.push(4);
    assertEquals(4, stack.pop());
    assertEquals(1, stack.pop());
    stack.pop();
  }
}