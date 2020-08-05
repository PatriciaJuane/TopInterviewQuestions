class ReverseInteger {

    public static int reverse(int x) {
       long result = 0;
        
        while(x!=0) {
            result = result * 10 + x%10; 
            x = x/10; 
        }
        
        if(result <Integer.MIN_VALUE || result>Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)result;
        }
        
    }

    public static void main(String[] args) {
      System.out.println(reverse(123)); //321

      System.out.println(reverse(-123)); //-321
      System.out.println(reverse(120)); //21
    }


}