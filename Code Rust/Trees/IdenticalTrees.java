public static boolean checkIdentical(TreeNode root1, TreeNode root2){

  if(root1 == null && root2 == null) return true;

  if(root1 == null || root2 == null) return false;

  Stack<TreeNode> stack = new Stack<>();
  stack.push(root1);
  stack.push(root2);

  while(!stack.isEmpty()){
    TreeNode temp1 = stack.pop();
    TreeNode temp2 = stack.pop();

    if(temp1.val != temp2.val) return false;

    if(temp1.left != null){
      if(temp2.left != null){
        stack.push(temp1.left);
        stack.push(temp2.left);
      }else{
        return false;
      }
    }
    if(temp1.right != null){
      if(temp2.right != null){
        stack.push(temp1.right);
        stack.push(temp2.right);
      }else{
        return false;
      }
    }
  }

  return true;
}
