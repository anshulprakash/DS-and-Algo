public static ArrayList<String> combParenthesis(int pairs) {
    
    ArrayList<String> out = new ArrayList<>();
    
    helper(pairs, pairs, "", out);

    return out;
}

public static void helper(int left, int right, String s, ArrayList<String> out){
    if(left > right){
        return;
    }
    if(left == 0 && right == 0){
        out.add(s);
    }
    if(left > 0){
        helper(left - 1, right, s + "(", out);
    }
    if(right > 0){
        helper(left, right - 1, s + ")", out);
    }
}
