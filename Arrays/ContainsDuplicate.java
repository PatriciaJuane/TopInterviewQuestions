import java.util.*;
// Contains Duplicate
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args) {
      int[] nums = {1,2,3,1};
      System.out.println(containsDuplicate(nums)); //true

      int[] nums2 = {1,2,3,4};
      System.out.println(containsDuplicate(nums2)); //false

      int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
      System.out.println(containsDuplicate(nums3)); //true

    }
}