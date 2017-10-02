public static ArrayList<String> getPermutations(String str) {
    if(str==null){
        return null;
    }
    ArrayList<String> output = new ArrayList<>();
    
    permutation("", str, output); 


return output;
}

public static void permutation(String prefix, String str, ArrayList<String> output) {
    int n = str.length();
    if (n == 0) output.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),output);
    }
}
M