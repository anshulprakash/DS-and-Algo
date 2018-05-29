//Given root of a binary tree, display node values at each level. Node values for all levels should be displayed on separate lines

public void levelOrderTraversal(TreeNode root){

  if(root == null) return root;

  Queue<TreeNode> q = new LinkedList<>();
  q.add(root);

  while(!q.isEmpty()){
    int size = q.size();
    for(int i = 0; i < size; i++){
      TreeNode temp = q.poll();
      System.out.print(temp.val);
      if(temp.left != null) q.add(temp.left);
      if(temp.right != null) q.add(temp.right);
    }
    System.out.println();
  }

  return;
}
