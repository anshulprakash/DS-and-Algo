

public static int maxSumPath(TreeNode root) {
    int[] max = new int[1];
    maxSumPathMain(root, max);
    
    return max[0];
    
}

public static int maxSumPathMain(TreeNode root , int[] max){
    if(root == null){
        return 0;
    }
    int leftSum = maxSumPathMain(root.left, max);
    int rightSum = maxSumPathMain(root.right, max);
    
    int nodeValue = Math.max(leftSum, rightSum) + root.data;
    
    max[0] = Math.max(max[0], leftSum + rightSum + root.data);
    return nodeValue;
}
