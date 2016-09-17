package com.yyqian.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created on 2016/9/16.
 *
 * @author Yinyin Qian
 */
public class Problem52Test {
  @Test
  public void multiply() throws Exception {
    Arrays.stream(Problem52.multiply(new int[]{1,2,3,4,5})).forEach(System.out::println);
  }

}