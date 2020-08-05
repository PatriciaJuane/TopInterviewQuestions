import java.util.*;

public class BinaryTree{

  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  TreeNode root;
 
  public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length -1);
  }   
    
  public TreeNode helper(int[] nums, int left, int right) {
        if(left > right) { // base case
            return null;
        }
        
        int mid = left + (right -left) / 2;
        
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid + 1, right);
        
        return root;
  }

    public static void main(String[] args) { 
      int[] nums = {-10,-3,0,5,9};
      BinaryTree tree = new BinaryTree(); 
      tree.sortedArrayToBST(nums);
      // print the tree with inorder traversal
    } 


}