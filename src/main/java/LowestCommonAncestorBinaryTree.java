public class LowestCommonAncestorBinaryTree {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }

    }
       public static class Solution {
            public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
                if (root == null) return null;
                TreeNode lh = lowestCommonAncestor(root.left, p, q);
                TreeNode rh = lowestCommonAncestor(root.right, p, q);
                boolean fp = find(root, p);
                boolean fq = find(root, q);
                if (fp == true && fq == true && lh != null) return lh;
                else if (fp == true && fq == true && rh != null) return rh;
                else if (fp == true && fq == true && lh == null && rh == null) return root;
                else return null;
            }

            public boolean find(TreeNode p, TreeNode q) {
                if (p == null) return false;
                if (p == q) return true;
                boolean lh = find(p.left, q);
                if (lh == true) return true;
                boolean rh = find(p.right, q);
                if (rh == true) return true;
                return false;
            }
        }

}

