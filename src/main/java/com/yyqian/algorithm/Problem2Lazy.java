package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 * Singleton Mode, Eager & Thread-safe
 *
 * @author Yinyin Qian
 */
public class Problem2Lazy {

  private Problem2Lazy() {
  }

  private static class LazyHolder {
    private static final Problem2Lazy INSTANCE = new Problem2Lazy();
  }

  public static Problem2Lazy getInstance() {
    return LazyHolder.INSTANCE;
  }
}
