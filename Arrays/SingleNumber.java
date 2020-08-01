import java.util.*;
// Single SingleNumber
//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {

    public static int singleNumber(int[] nums) {
      int x = 0;
      for(int i=0; i<nums.length; i++) {
        x = x ^ nums[i];
      }     
      return x;
    }

    public static void main(String[] args) {
      int[] nums = {2,2,1};
      System.out.println(singleNumber(nums)); //1

      int[] nums2 = {4,1,2,1,2};
      System.out.println(singleNumber(nums2)); //4

    }
}