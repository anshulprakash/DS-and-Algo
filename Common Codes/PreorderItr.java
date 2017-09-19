// java.util.* has been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    
    Stack st = new Stack();
    ArrayList<Integer> list = new ArrayList<>();
    
    if(root == null)
        return list;
    st.push(root);
    
    while(!st.empty()){
        TreeNode curr = (TreeNode)st.pop();
        list.add(curr.data);
        if(curr.right != null)
            st.push(curr.right);
        if(curr.left != null)
            st.push(curr.left);
    }
    
    return list;

}