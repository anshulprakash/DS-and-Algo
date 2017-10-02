public int pathLengthFromRoot(TreeNode root, int n1) {
    if (root == null) return 0;
    else {
        int out = 0;
        if ((root.data == n1) || (out = pathLengthFromRoot(root.left, n1)) > 0
                || (out = pathLengthFromRoot(root.right, n1)) > 0) {
            return out + 1;
        }
        return 0;
    }
}