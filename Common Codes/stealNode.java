// Recursive method
public TreeNode delete(TreeNode root, int data) { 

    if(root == null) { 
                return null;
            } else if(data < root.data) {
                root.left = delete(root.left, data);
            } else if(data > root.data) {
                root.right = delete(root.right, data);
            } else { //element found
                if(root.left != null && root.right != null) { //full node case
                    root.data = findMin(root.right).data;    
                    root.right = delete(root.right, root.data);
                } else if(root.left == null && root.right == null) {
                    root = null;
                }  
                else if(root.left == null) {
                    root = root.right;
                } else if(root.right == null) {
                    root = root.left;                
                }                
            }
            return root;
}


// Iterative Method

public TreeNode delete(TreeNode root, int data) { 

    if(root == null){
        return null;
    }              
    
    HashMap<TreeNode, TreeNode> map = new HashMap<>();
    Queue<TreeNode> q = new LinkedList<>();
    
    q.add(root);
    map.put(root, null);
    
    while(!q.isEmpty()){
        TreeNode temp = q.remove();
        if(temp.data == data){
            TreeNode tempAnc = map.get(temp);
            if(temp.left == null && temp.right == null){
                
                if(tempAnc != null){
                    if(tempAnc.left == temp){
                        tempAnc.left = null;
                    }else{
                        tempAnc.right = null;
                    }
                }else{
                    root = null;
                }
                
            }else if(temp.left != null && temp.right != null){
                TreeNode minRight = findMin(temp.right);
                if(tempAnc != null){
                    if(tempAnc.left == temp){
                        tempAnc.left.data = minRight.data;
                    }else{
                        tempAnc.right.data = minRight.data;
                    }
                }else{
                    root.data = minRight.data;
                }
                temp.right = delete(temp.right,minRight.data);
            }else if(temp.left != null && temp.right == null){
                if(tempAnc != null){
                    if(tempAnc.left == temp){
                        tempAnc.left = temp.left;
                    }else{
                        tempAnc.right = temp.left;
                    }
                }else{
                    root = temp.left;
                }
            }else{
                if(tempAnc != null){
                    if(tempAnc.left == temp){
                        tempAnc.left = temp.right;
                    }else{
                        tempAnc.right = temp.right;
                    }
                }else{
                    root = temp.right;
                }
            }
            
            break;
        }else{
            if(temp.left != null){
                q.add(temp.left);
                map.put(temp.left, temp);
            }
            if(temp.right != null){
                q.add(temp.right);
                map.put(temp.right, temp);
            }
        }
    }
    
    return root;
    
}