package com.yyqian.algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created on 9/19/16.
 *
 * @author Yinyin Qian
 */
public class Problem64 {
  public static double[] streamMedian(int[] nums) {
    PriorityQueue<Integer> rightPQ = new PriorityQueue<>(); // 默认是 natural ordering，也就是 minPQ
    PriorityQueue<Integer> leftPQ = new PriorityQueue<>(Collections.reverseOrder()); // 指定 Comparator，变成 maxPQ
    double[] res = new double[nums.length];
    for (int i = 0; i < nums.length; i++) {
      // add element
      if (leftPQ.isEmpty() || nums[i] <= leftPQ.peek()) {
        leftPQ.offer(nums[i]);
      } else {
        rightPQ.offer(nums[i]);
      }
      // adjust size
      if (rightPQ.size() > leftPQ.size()) {
        leftPQ.offer(rightPQ.poll());
        assert leftPQ.size() - rightPQ.size() == 1;
      } else if (leftPQ.size() - rightPQ.size() > 1) {
        rightPQ.offer(leftPQ.poll());
        assert leftPQ.size() == rightPQ.size();
      }
      // get median
      if (rightPQ.size() == leftPQ.size()) {
        res[i] = (leftPQ.peek() + rightPQ.peek()) * 0.5;
      } else {
        res[i] = leftPQ.peek();
      }
    }
    return res;
  }
}
