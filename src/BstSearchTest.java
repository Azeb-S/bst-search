import static org.junit.jupiter.api.Assertions.*;

import javax.swing.tree.TreeNode;

import org.junit.jupiter.api.Test;

public class BstSearchTest {
 @Test
 void contains_emptyTree() {
  assertFalse(BstSearch.contains(null, 10));
 }

 @Test 
 void contains_target(){
  BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(47)
  assertTrue(BstSearch.contains(root, 47));
 }

}
