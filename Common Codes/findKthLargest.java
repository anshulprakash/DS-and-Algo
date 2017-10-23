public TreeNode findKthLargest(TreeNode root, int k) {
    
    if(root == null){
        return null;
    }
    
    int size = size(root.right);
    
    if(k == size + 1){
        return root;
    }else if(k < size){
        return findKthLargest(root.right, k);
    }else{
        return findKthLargest(root.left, k - size - 1);
    }

}
