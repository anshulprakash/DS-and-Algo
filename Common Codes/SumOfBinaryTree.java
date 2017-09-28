// java.util.* has been imported for this problem.
// You don't need any other imports.

public int sumItr(TreeNode root) { 
    
     int sum = 0;
        if(root == null){
            return sum;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            sum += temp.data;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        
        return sum;


}