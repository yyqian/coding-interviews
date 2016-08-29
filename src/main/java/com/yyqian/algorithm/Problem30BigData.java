package com.yyqian.algorithm;

import java.util.PriorityQueue;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem30BigData {
  public static int[] topK(int[] numbers, int k) {
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
    for (int i = 0; i < k; i++) {
      maxQueue.offer(numbers[i]);
    }
    for (int i = k; i < numbers.length; i++) {
      if (numbers[i] < maxQueue.peek()) {
        maxQueue.poll();
        maxQueue.offer(numbers[i]);
      }
    }
    return maxQueue.stream().mapToInt(x -> x).toArray();
  }
}
