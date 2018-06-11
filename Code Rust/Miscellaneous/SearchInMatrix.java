//Search (find position of) a given key in 2D matrix. All rows and columns are sorted.
public static int[] searchElement(int[][] matrix, int val){
  int[] res = new int[]{-1,-1};
  int rows = matrix.length;
  int cols = matrix[0].length;

  int row = 0, col = cols - 1;
  while(row < rows && col >= 0){
    if(matrix[row][col] == val){
      res[0] = row;
      res[1] = col;
      return res;
    }else if(matrix[row][col] < val){
      row++;
    }else{
      col--;
    }
  }

  return res;
}
