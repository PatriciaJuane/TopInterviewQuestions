import java.util.*;
//Given two arrays, write a function to compute their intersection.
public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) { // O(n) time and space
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x = 0; // nums1
        int y = 0; // nums2
        int k = 0; // intersection arr
        
        int length = (nums1.length > nums2.length) ? nums2.length : nums1.length;
        int[] intersection = new int[length]; // 2, 2, 0, 0, 0 .... length
        while(x<nums1.length && y<nums2.length) {
            if(nums1[x]<nums2[y]) {
                x++;
            } else if (nums1[x]>nums2[y]) {
                y++;
            } else {
                intersection[k] = nums1[x];
                x++;
                y++;
                k++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, k);  
    }
    public static void main(String[] args) {
      int[] nums1 = {1,2,2,1};
      int[] nums2 = {2,2};
      int[] result = intersect(nums1,nums2); // 2,2
      for(int i=0; i<result.length; i++) {
        System.out.print(result[i] + " ");
      }
      System.out.println();

      int[] numsA = {4,9,5};
      int[] numsB = {9,4,9,8,4};
      int[] result2 = intersect(numsA,numsB); // 4,9
      for(int i=0; i<result2.length; i++) {
        System.out.print(result2[i] + " ");
      }

    }
}