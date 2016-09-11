package com.yyqian.algorithm;

/**
 * Created on 9/11/16.
 *
 * @author Yinyin Qian
 */
public class Problem47 {
  public static int add(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return num1 == 0 ? num2 : num1;
    } else {
      return add(num1 ^ num2, (num1 & num2) << 1);
    }
  }
}
