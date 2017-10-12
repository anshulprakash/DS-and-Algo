public ArrayList<String> printPaths(char[][] board){
    ArrayList<String> output = new ArrayList<>();
    
    helper(0, 0, "", board, output);
    
    return output;
}

public void helper(int r, int c, String prefix, char[][] board, ArrayList<String> output){
    int rows = board.length;
    int cols = board[0].length;
    
    if(r > rows - 1||
    c > cols -1){
        return;
    }
    char temp = board[r][c];
    if(r == rows -1 && c == cols - 1){
        output.add(prefix + temp);
    }else{
        helper(r+1, c, prefix + temp, board, output);
        helper(r, c+1, prefix + temp, board, output);
    }
}