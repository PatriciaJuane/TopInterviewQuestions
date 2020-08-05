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
 
  public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                
                if(current.left!=null) {
                    queue.add(current.left);
                }
                if(current.right!=null) {
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
  
        // print all elements with for loops
        tree.levelOrder(tree.root);

        BinaryTree tree2 = new BinaryTree(); 
        tree2.root = new TreeNode(1); 
        tree2.root.left = new TreeNode(2); 
        tree2.root.right = new TreeNode(2); 
        tree2.root.left.left = new TreeNode(3); 
        tree2.root.left.right = new TreeNode(4); 
        tree2.root.right.left = new TreeNode(4); 
        tree2.root.right.right = new TreeNode(3); 
        // print all elements with for loops
        tree2.levelOrder(tree2.root);

    } 

}