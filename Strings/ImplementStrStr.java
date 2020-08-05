class ImplementStrStr {
 /*
 Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
*/
  public static int strStr(String haystack, String needle) {
        
      int H = haystack.length();
      int N = needle.length();
        
      for(int i=0; i <= H - N; i++) {  // O(H * N)  
          int j;
          for(j=0; j<N; j++) {
              if(haystack.charAt(i+j) != needle.charAt(j)) {
                break;
              }
          }
            
          if(j==N) {
            return i;
          }   
      }
        
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(strStr("hello","ll")); // 2
    System.out.println(strStr("aaaaa","bba")); // -1
  }

}