import java.util.ArrayList;

public class ValidateBinarySearchTree {

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
        public boolean fullArr(ArrayList<Integer> arr, int val)
        {
            if (arr.size() > 0)
            {
                if (arr.get(arr.size() - 1) < val)
                    arr.add(val);
                else
                    return  false;
            }
            else
                arr.add(val);
            return true;
        }

        public boolean checkArr(TreeNode root, ArrayList<Integer> arr) {
            boolean ok = true;

            if (ok && root.left != null)
            {
                if ((root.left.val < root.val))
                    ok = checkArr(root.left, arr);
                else
                    ok = false;
            }
            if (ok) ok = fullArr(arr, root.val);
            if (ok && root.right != null) {
                if (root.right.val > root.val)
                    ok = checkArr(root.right, arr);
                else
                    ok = false;
            }
            return ok;
        }

        public boolean isValidBST(TreeNode root) {
            return checkArr(root, new ArrayList<Integer>());
        }
    }
}
