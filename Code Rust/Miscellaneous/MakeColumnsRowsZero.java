//Given a two dimensional array, if any element in it is zero make its whole row and column zero.

public void makeColsRowsZero(int[][] matrix){
  int rows = matrix.length
  int cols = matrix[0].length;

  Set<Integer> rows_zero = new HashSet<>();
  Set<Integer> cols_zero = new HashSet<>();

  for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
      if(matrix[i][j] == 0){
        rows_zero.add(i);
        cols_zero.add(j);
      }
    }
  }

  for(int row : rows_zero){
    for(int i = 0 ; i < cols; i++){
      matrix[row][i] = 0;
    }
  }
  for(int col : cols_zero){
    for(int i = 0 ; i < rows; i++){
      matrix[i][rows] = 0;
    }
  }
}
