class ValidPalindrome {

    public static boolean isPalindrome(String s) {     // O(1) space  & O(n) time
       if(s==null){
            return false;
        }
 
        s = s.toLowerCase();

        int i=0;
        int j=s.length()-1;

        while(i<j){
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                        || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
                i++;
            }
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                        || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
      String s = "A man, a plan, a canal: Panama";
      System.out.println(isPalindrome(s)); // true
      String s2 = "race a car";
      System.out.println(isPalindrome(s2)); // false

    }
    
}