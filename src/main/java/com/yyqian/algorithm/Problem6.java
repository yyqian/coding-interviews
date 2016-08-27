package com.yyqian.algorithm;

/**
 * Created on 8/27/16.
 *
 * @author Yinyin Qian
 */
public class Problem6 {
  public TreeNode<Integer> construct(int[] preorder, int[] inorder) {
    if (preorder == null || inorder == null || preorder.length != inorder.length) {
      return null;
    }
    return construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
  }

  private TreeNode<Integer> construct(
      int[] preorder, int[] inorder,
      int preorderLo, int preorderHi,
      int inorderLo, int inorderHi) {

    if (preorderLo > preorderHi || inorderLo > inorderHi) {
      return null;
    }

    int relative = 0;
    for (; relative <= (inorderHi - inorderLo); relative++) {
      if (inorder[inorderLo + relative] == preorder[preorderLo]) {
        break;
      }
    }

    TreeNode<Integer> left = construct(
        preorder, inorder,
        preorderLo + 1, preorderLo + relative,
        inorderLo, inorderLo + relative - 1);

    TreeNode<Integer> right = construct(
        preorder, inorder,
        preorderLo + relative + 1, preorderHi,
        inorderLo + relative + 1, inorderHi);

    return new TreeNode<>(preorder[preorderLo], left, right);
  }
}
