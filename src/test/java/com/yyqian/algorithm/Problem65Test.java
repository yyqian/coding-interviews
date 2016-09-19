package com.yyqian.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem65Test {
  @Test
  public void window() throws Exception {
    Arrays.stream(Problem65.maxInWindow(new int[] {2, 3, 4, 2, 6, 2, 5, 1}, 3)).forEach(System.out::println);
  }

  @Test
  public void testQueueWithMax() {
    Problem65.QueueWithMax<Integer> queue1 = new Problem65.QueueWithMax<>();
    Problem65.QueueWithMaxB<Integer> queue2 = new Problem65.QueueWithMaxB<>();
    int max = 0;
    Random rnd = new Random();
    for (int i = 0; i < 1000; i++) {
      int x = rnd.nextInt(1000);
      max = Math.max(x, max);
      queue1.offer(x);
      queue2.offer(x);
      assertEquals(max, queue1.max().intValue());
      assertEquals(max, queue2.max().intValue());
    }
    for (int i = 0; i < 1000; i++) {
      assertEquals(queue1.max().intValue(), queue2.max().intValue());
      queue1.poll();
      queue2.poll();
    }
  }

}