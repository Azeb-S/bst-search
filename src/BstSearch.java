import java.util.Stack;

public class BstSearch {
    /**
     * Returns whether a binary search tree contains a given value.
     * 
     * As a precondition, the input root is assumed to be the root of a binary
     * search tree; this is not validated by the method. Passing in an invalid
     * tree causes undefined behavior.
     * 
     * A null value for the root is considered to represent a valid but empty
     * binary search tree. A null root will cause this method to always return
     * false if a valid target is given.
     * 
     * @param <T>    The type of the values held in the nodes
     * @param root   the root of the binary search tree (assumed to be valid)
     * @param target the value to search for
     * @return true if the target is contained in the tree, false otherwise
     * @throws NullPointerException if target is null
     */
    public static <T extends Comparable<T>> boolean contains(BinaryTreeNode<T> root, T target) {
        if (root == null) {
            return false;
        }

        if (root.data != null && root.data.equals(target))
            return true;
        return contains(root.left, target) || contains(root.right, target);

    }

    public static <T extends Comparable<T>> boolean containsIterativly(BinaryTreeNode<T> root, T target) {

        if (root == null) {
            return false;
        }

        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        stack.push(root);

        while ((!stack.isEmpty())) {

            BinaryTreeNode<T> current = stack.pop();
            if (current.data != null && current.data.equals(target)) {
                return true;
            }
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }

        }

        return false;

    }

}
