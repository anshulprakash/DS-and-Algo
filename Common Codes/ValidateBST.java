public static boolean validateBST(TreeNode root) {
    return validateBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public static boolean validateBST(TreeNode root, int min, int max) {
    if (root == null) {
            return true;
    }
    if (root.data <= min || root.data >= max) {
            return false;
    }
    // left subtree must be < root.val && right subtree must be > root.val
    return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
}