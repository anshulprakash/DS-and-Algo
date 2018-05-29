//Inorder successor of a node in binary Search Tree (BST) is the next node in inorder traversal. Write a method to find the inorder successor of a given value "d" in a BST.

public static int findInorderSuccessor(TreeNode root, int d){

  if(root == null) return null;

  if(d >= root.val){
    return findInorderSuccessor(root.right, d);
  }else{
    TreeNode left = findInorderSuccessor(root.left, d);

    return left == null ? root : left;
  }
}
