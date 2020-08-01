import java.util.*;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice
public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2) {
            return new int[]{0,0};
        }
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int complement = target-nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
      int[] nums = {2,7,11,15};
      int[] result = twoSum(nums,9); //0, 1
      for(int i=0; i<result.length; i++) {
        System.out.print(result[i]+" ");
      }
      System.out.println();
    }
}