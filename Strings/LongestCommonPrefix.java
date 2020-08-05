class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        String prefix = strs[0]; // flower
        for(int i = 1; i<strs.length; i++) { // O(n*m)
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
      String[] strs = {"flower","flow","flight"};
      System.out.println(longestCommonPrefix(strs)); // fl

      String[] strs2 = {"dog","racecar","car"};
      System.out.println(longestCommonPrefix(strs2)); // empty
    }
}

// prefix = "fl"
// "flow","flight"