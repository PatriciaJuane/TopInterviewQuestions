import java.util.*;

public class MaximumSubarray {

// option with dynamic programming
  public static int maxSubArray2(int[] A) {
    return maxSubArray(A, 0, A.length - 1);
    
  }
    
  public static int maxSubArray(int[] A, int left, int right) {
		if (left == right) return A[left];
		int mid = (right - left) / 2 + left, leftMax, rightMax;
		leftMax = rightMax = Integer.MIN_VALUE;
		for (int i = mid, sum = 0; i >= left; --i) leftMax = Math.max(leftMax, sum += A[i]);
		for (int j = mid + 1, sum = 0; j <= right; ++j) rightMax = Math.max(rightMax, sum += A[j]);
		return Math.max(Math.max(maxSubArray(A, left, mid), maxSubArray(A, mid + 1, right)), leftMax + rightMax);
  }
	
	// option with aux array  -> O(n) time
    public static int maxSubArray(int[] nums) {
            int sum=0;
            int max=nums[0];//initiating max initially as first element
            int i;
    /*In this loop i am traversing from first to last element of the array 
	and I am making the sum as zero if it is negative. 
	If we wont do this the sum after this will be reduced. 
	And every time I am checking the sum with max and 
	if sum at that point is more than max I am replacing max with the sum.*/ 
        for(i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(max<sum)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }

    public static void main(String[] args) {
      int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
      System.out.println("result " + maxSubArray(nums)); // 6

    }


}