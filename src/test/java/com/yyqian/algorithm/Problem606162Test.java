package com.yyqian.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 9/18/16.
 *
 * @author Yinyin Qian
 */
public class Problem606162Test {
  @Test
  public void print() throws Exception {
    TreeNode<Integer> root = new TreeNode<>(8,
        new TreeNode<Integer>(6, new TreeNode<Integer>(5), new TreeNode<Integer>(7)),
        new TreeNode<Integer>(10, new TreeNode<Integer>(9), new TreeNode<Integer>(11)));
    System.out.println("Left-To-Right:");
    Problem60.print(root);
    System.out.println("Zig-Zag:");
    Problem61.print(root);
    // problem62
    String token = Problem62.serialize(root);
    System.out.println("Serialized:");
    System.out.println(token);
    System.out.println("Deserialized:");
    Problem60.print(Problem62.deserialize(token));
  }

}