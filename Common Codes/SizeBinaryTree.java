public int size(TreeNode root) {
    if(root == null){
        return 0;
    }else{
        return 1 + size(root.left) + size(root.right);
    }

    
}