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
 
  public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null)  return false;
        return (t1.val == t2.val) && isMirror(t1.right,t2.left) && isMirror(t1.left,t2.right);
    }

    public static void main(String[] args) { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
   
        System.out.println("Is symmetric? : " + tree.isSymmetric(tree.root)); // false

        BinaryTree tree2 = new BinaryTree(); 
        tree2.root = new TreeNode(1); 
        tree2.root.left = new TreeNode(2); 
        tree2.root.right = new TreeNode(2); 
        tree2.root.left.left = new TreeNode(3); 
        tree2.root.left.right = new TreeNode(4); 
        tree2.root.right.left = new TreeNode(4); 
        tree2.root.right.right = new TreeNode(3); 
        System.out.println("Is symmetric? : " + tree2.isSymmetric(tree2.root)); // true

    } 

}