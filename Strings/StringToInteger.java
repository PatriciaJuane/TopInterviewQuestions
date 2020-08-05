class StringToInteger { // atoi 

    public static int myAtoi(String str) {
        // trim white spaces
        str = str.trim();
        
        if(str == null || str.length() < 1) {
            return 0;
        }
          
        char flag = '+';
        
        int i=0;
        
        if(str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        
        double result = 0;
        
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') { // a number
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        
        if(flag == '-') {
            result = -result;
        }
        
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int) result;
        
    }

    public static void main(String[] args) {
      System.out.println(myAtoi("42")); // 42
      System.out.println(myAtoi("    -42")); //-42
      System.out.println(myAtoi("4193 with words")); // 4193
      System.out.println(myAtoi("words and 987")); // 0
      System.out.println(myAtoi("-91283472332")); // -2147483648
    }
}