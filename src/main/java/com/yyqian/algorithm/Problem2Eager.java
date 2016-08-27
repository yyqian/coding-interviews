package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 * Singleton Mode, Lazy & Thread-safe
 *
 * @author Yinyin Qian
 */
public class Problem2Eager {

  private static final Problem2Eager INSTANCE = new Problem2Eager();

  private Problem2Eager() {
  }

  public static Problem2Eager getInstance() {
    return INSTANCE;
  }
}
