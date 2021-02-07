package com.vcgmuse.algoexpertio;

public class NodeDepth {
  public static int nodeDepths(BinaryTree root) {
    return nodeDepthsHelper(root, 0);
    // Write your code here.
  }

  public static int nodeDepthsHelper(BinaryTree root, int depth) {

    if (root == null) {
      return 0;
    }
    return depth + nodeDepthsHelper(root.left, depth + 1) + nodeDepthsHelper(root.right, depth + 1);
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
