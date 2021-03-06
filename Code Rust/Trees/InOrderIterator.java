// Create a Inorder iterator

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    private TreeNode root;
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
          this.root = root;
          stack = new Stack<>();
          pushAll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode ret = stack.pop();

        if(ret.right != null){
          root = ret.right;
          pushAll();
        }

        return ret;
    }

    private void pushAll(){
      while(root != null){
        stack.push(root);
        root = root.left;
      }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
