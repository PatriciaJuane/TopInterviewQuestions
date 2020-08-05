import java.util.*;

public class HouseRobber {
// Dynamic Programming - O(n) time and space
    public static int rob(int[] nums) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        if(nums.length==1) {
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
      int[] nums = {1,2,3,1};
      System.out.println(rob(nums)); // 4

      int[] nums2 = {2,7,9,3,1};
      System.out.println(rob(nums2)); // 12

    }
}