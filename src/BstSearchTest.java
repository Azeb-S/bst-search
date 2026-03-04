import static org.junit.jupiter.api.Assertions.*;

import javax.swing.tree.TreeNode;

import org.junit.jupiter.api.Test;

public class BstSearchTest {
 @Test
 void contains_emptyTree() {
  assertFalse(BstSearch.contains(null, 10));
 }

 @Test
 void contains_target() {
  BinaryTreeNode<Integer> root = new BinaryTreeNode<>(47);
  assertTrue(BstSearch.contains(root, 47));
 }

 @Test
 void test_multipleLevels() {
  /*
   * 13
   * / \
   * -5 42
   * / \ /
   * 9 9 100
   * / \
   * 31 7
   *
   * Leaf nodes: 9, 31, 7, 100
   *
   */
  BinaryTreeNode<Integer> root = new BinaryTreeNode<>(13);
  root.left = new BinaryTreeNode<>(-5);
  root.right = new BinaryTreeNode<>(42);

  root.left.left = new BinaryTreeNode<>(9);
  root.left.right = new BinaryTreeNode<>(9);
  root.left.right.left = new BinaryTreeNode<>(31);
  root.left.right.right = new BinaryTreeNode<>(7);

  root.right.left = new BinaryTreeNode<>(100);

  assertTrue(BstSearch.contains(root, 100));
 }

 @Test
 void test_multipleLevels_itera() {
  /*
   * 13
   * / \
   * -5 42
   * / \ /
   * 9 9 100
   * / \
   * 31 7
   *
   * Leaf nodes: 9, 31, 7, 100
   *
   */
  BinaryTreeNode<Integer> root = new BinaryTreeNode<>(13);
  root.left = new BinaryTreeNode<>(-5);
  root.right = new BinaryTreeNode<>(42);

  root.left.left = new BinaryTreeNode<>(9);
  root.left.right = new BinaryTreeNode<>(9);
  root.left.right.left = new BinaryTreeNode<>(31);
  root.left.right.right = new BinaryTreeNode<>(7);

  root.right.left = new BinaryTreeNode<>(100);

  assertTrue(BstSearch.containsIterativly(root, 100));
 }

 @Test
 void contains_emptyTreeIteration() {
  assertFalse(BstSearch.containsIterativly(null, 10));
 }

 @Test
 void contains_targetIteration() {
  BinaryTreeNode<Integer> root = new BinaryTreeNode<>(47);
  assertTrue(BstSearch.containsIterativly(root, 47));
 }

}
