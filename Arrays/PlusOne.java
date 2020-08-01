import java.util.*;
//Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//You may assume the integer does not contain any leading zero, except the number 0 itself.
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        // 999
        // 189
      int length = digits.length;
        
      for(int i=length-1; i>=0; i--) { // O(n) time and space
        if(digits[i]<9) { // 999 -> 1000
          digits[i]++;
          return digits;
        }
            
        digits[i] = 0;
      }  
      int[] newArray =  new int[length+1];
      newArray[0] = 1;  
      return newArray;
    }

    public static void main(String[] args) {
      int[] nums = {1,2,3};
      plusOne(nums); //124
      for(int i=0; i<nums.length; i++) {
        System.out.print(nums[i]+" ");
      }
      System.out.println(); 

      int[] numsA = {4,3,2,1};
      plusOne(numsA); //4322
      for(int i=0; i<numsA.length; i++) {
        System.out.print(numsA[i]+" ");
      }
    }
}