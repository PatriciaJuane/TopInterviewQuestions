import java.util.*;
//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k; i<nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
      int[] nums = {0,1,0,3,12};
      moveZeroes(nums); //124
      for(int i=0; i<nums.length; i++) {
        System.out.print(nums[i]+" ");
      }
      System.out.println();
    }
}