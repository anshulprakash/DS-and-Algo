public int editDistance(String a, String b){
    int aLength = a.length();
    int bLength = b.length();
    int[][] costMemo = new int[aLength][bLength];
    if(a.charAt(0) != b.charAt(0)){
        costMemo[0][0] = 1;
    }
    for(int i = 1; i < aLength; i++){
        costMemo[i][0] = 1 + costMemo[i-1][0];
    }
    for(int j = 1; j < bLength; j++){
        costMemo[0][j] = 1 + costMemo[0][j-1];
    }
    for(int i = 1; i < aLength; i++){
        for(int j = 1; j < bLength; j++){
            if(a.charAt(i) == b.charAt(j)){
             costMemo[i][j] = costMemo[i-1][j-1];
            }else {
             int replaceDist = 1 + costMemo[i-1][j-1];
             int insertDist = 1 + costMemo[i][j-1];
             int deleteDist = 1 + costMemo[i-1][j];
             int minDist = Math.min(replaceDist,Math.min(insertDist, deleteDist));
             costMemo[i][j] = minDist;
            }
        }
    }
    return costMemo[aLength-1][bLength-1];
}