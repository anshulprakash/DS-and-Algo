public static void transposeMatrix(int[][] matrix) {
    int n = matrix.length;
    
    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            if(i!=j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}