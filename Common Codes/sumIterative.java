public int sumItr(TreeNode root) { 
    int sum =0;
    if (root == null)
        return 0;
    Queue<TreeNode> cute1 = new LinkedList<TreeNode>();
    cute1.add(root);
    while (!cute1.isEmpty())
    {
        TreeNode temp = cute1.remove();
        sum+= temp.data;
        if(temp.left != null )
            cute1.add(temp.left);
        if(temp.right != null)
            cute1.add(temp.right);
    }
    return sum;

}
