class CountAndSay {
  
    public static String countAndSay(int n) {
       if(n<=0) {
           return "";
       }
        String result = "1";
        
        while(n>1) {
            StringBuilder curr = new StringBuilder();
            for(int i=0; i<result.length(); i++) {
                 int count = 1;
                while((i+1 < result.length()) && result.charAt(i) == result.charAt(i+1)) {
                    count++;
                    i++;
                }
                
                curr.append(count).append(result.charAt(i));
            }
            
            result = curr.toString();
            n--;
        }
        
        return result;
    }

    public static void main(String[] args) {
      System.out.println(countAndSay(1)); // 1 base case
      System.out.println(countAndSay(4)); // 1211
    }
}