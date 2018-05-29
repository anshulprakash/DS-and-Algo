//Write inorder traversal of a binary tree iteratively.
public static void inorderTraversal(TreeNode root){

  if(root == null){
    return;
  }

  Stack<TreeNode> stack = new Stack<>();

  while(root != null || !stack.isEmpty()){

    while(root != null){
      stack.push(root);
      root = root.left;
    }

    root = stack.pop();
    System.out.println(root.val);
    root = root.right;
  }
}
