public TreeNode delete(TreeNode root, int data) { 
    if(root == null){
        return null;
    } 
    if(root.data != data){
        if(root.data > data){
            root.left = delete(root.left, data);
        }else{
            root.right = delete(root.right, data);
        }
    }
    if(root.data == data){
        if(root.left != null && root.right != null){
            TreeNode temp = findMin(root.right);
            root.right = delete(root.right, temp.data);
            root.data = temp.data;
            return root;
        }else if(root.left == null && root.right == null){
            return null;
        }else{
            if(root.left == null){
                return root.right;
            }else{
                return root.left;
            }
        }
    }
    return root;
}