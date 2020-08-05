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
 
  public static boolean isValidBST(TreeNode root) { //INORDER 
        Stack<TreeNode> stack = new Stack<>();
        double inorderValue = - Double.MAX_VALUE;
        
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            if(root.val <= inorderValue) {
                return false;
            }
            
            inorderValue = root.val;
            root =  root.right;
        }
        
        return true;
    }

    public static void main(String[] args) { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
   
        System.out.println("Is valid BST? : " + tree.isValidBST(tree.root)); // false

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new TreeNode(2);
        tree2.root.left = new TreeNode(1);
        tree2.root.right = new TreeNode(3);
        System.out.println("Is valid BST? : " + tree2.isValidBST(tree2.root)); // true

    } 

}