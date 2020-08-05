import java.util.*;
import java.lang.Math;

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
 
     public static int maxDepth(TreeNode root) {
       if(root==null) {
           return 0;
       }
        if(root.left==null && root.right == null) {
            return 1;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
   
        System.out.println("Height of tree is : " + tree.maxDepth(tree.root)); // 3
    } 


}