class ReverseString {
  public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        
        while(i<j) { // O(n/2) time and O(1) space
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
  }

    public static void main(String[] args) {
      char[] s = {'h','o','l','a'};
      reverseString(s);
      System.out.println(s);
    }

}
