import java.util.*;
// Remove Duplicates from Sorted Array
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
       int k = 1;
        
        for(int i=1; i<nums.length; i++) { // 0, 0, 1, 1, 2, 3
            if(nums[i]!=nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;        
    }

    public static void main(String[] args) {
      int[] nums = {1,1,2};
      System.out.println(removeDuplicates(nums));

      int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
      System.out.println(removeDuplicates(nums2));

    }
}