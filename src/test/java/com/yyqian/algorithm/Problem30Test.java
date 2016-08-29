package com.yyqian.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created on 2016/8/29.
 *
 * @author Yinyin Qian
 */
public class Problem30Test {
  @Test
  public void topK() throws Exception {
    int[] numbers = {4,5,1,6,2,7,3,8};
    int[] res = Problem30BigData.topK(numbers, 4);
    int[] res2 = Problem30.topK(numbers, 4);
    Arrays.stream(res).forEach(System.out::println);
    Arrays.stream(res2).forEach(System.out::println);
  }

}