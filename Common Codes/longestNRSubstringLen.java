public static int longestNRSubstringLen(String input) {
        if(input==null)
            return 0;
          char[] array = input.toCharArray();
          int prev = 0;
 
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
       
        for (int i = 0; i < array.length; i++) {
          if (!characterMap.containsKey(array[i])) {
            characterMap.put(array[i], i);
          } else {
            prev = Math.max(prev, characterMap.size());
            i = characterMap.get(array[i]);
            characterMap.clear();
          }
        }
        return Math.max(prev, characterMap.size());
   }