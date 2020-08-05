public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // 1st one -> sort strings (O(n log n)) and compare them with an equals
        // 2nd one -> hashmap that contains the number of times a character appears (O(n) space)
        // 3d one -> array integers (count times) -> better one
        
        if(s.length()!=t.length()) {
            return false;
        }
        
        int[] count = new int[26]; // 26 is the number of lowercase letters
        
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) -'a']++;
            count[t.charAt(i) -'a']--;
        }
        
        for(int c: count) {
            if(c!=0) {
                return false;
            }
        }
        // O(n) time and O(1) space!!
        return true;      
    }

    public static void main(String[] args) {
      System.out.println(isAnagram("anagram","nagaram")); // true
      System.out.println(isAnagram("rat","car")); // false

    }
}