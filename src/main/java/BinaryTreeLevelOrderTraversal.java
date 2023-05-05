import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

 // Definition for a binary tree node.
 public static class TreeNode {
     int val;
      public TreeNode left;
     public TreeNode right;
     TreeNode() {}
     public TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
     }
  }

    public static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
            if(root==null){
                return finalAns;
            }
            q.add(root);
            while(!q.isEmpty()){
                int levels = q.size();
                List<Integer> subLevels = new ArrayList<>();
                for(int i=0;i<levels;i++){
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    subLevels.add(q.remove().val);
                }
                finalAns.add(subLevels);
            }
            return finalAns;
        }
    }
}
