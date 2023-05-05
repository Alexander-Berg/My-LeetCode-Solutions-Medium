package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* LowestCommonAncestorBinaryTree Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

    public class LowestCommonAncestorBinaryTreeTest {

        @Before
        public void before() throws Exception {
        }

        @After
        public void after() throws Exception {
        }
        @Test
        public void testLowestCommonAncestor() {
            LowestCommonAncestorBinaryTree.TreeNode root = new LowestCommonAncestorBinaryTree.TreeNode(3);
            root.left = new LowestCommonAncestorBinaryTree.TreeNode(5);
            root.right = new LowestCommonAncestorBinaryTree.TreeNode(1);
            root.left.left = new LowestCommonAncestorBinaryTree.TreeNode(6);
            root.left.right = new LowestCommonAncestorBinaryTree.TreeNode(2);
            root.right.left = new LowestCommonAncestorBinaryTree.TreeNode(0);
            root.right.right = new LowestCommonAncestorBinaryTree.TreeNode(8);
            root.left.right.left = new LowestCommonAncestorBinaryTree.TreeNode(7);
            root.left.right.right = new LowestCommonAncestorBinaryTree.TreeNode(4);

            LowestCommonAncestorBinaryTree.Solution solution = new LowestCommonAncestorBinaryTree.Solution();

            // Test case where p and q are present in the tree
            LowestCommonAncestorBinaryTree.TreeNode p = root.left;
            LowestCommonAncestorBinaryTree.TreeNode q = root.right;
            assertEquals(root, solution.lowestCommonAncestor(root, p, q));

            // Test case where p is an ancestor of q
            p = root;
            q = root.right.right;
            assertEquals(root, solution.lowestCommonAncestor(root, p, q));

            // Test case where p and q are the same node
            p = root.left.left;
            q = root.left.left;
            assertEquals(p, solution.lowestCommonAncestor(root, p, q));

            // Test case where one of p and q is not present in the tree
            p = new LowestCommonAncestorBinaryTree.TreeNode(9);
            q = root.right.right;
            assertNull(solution.lowestCommonAncestor(root, p, q));
        }

        @Test
        public void testLowestCommonAncestorWithNullTree() {
            LowestCommonAncestorBinaryTree.Solution solution = new LowestCommonAncestorBinaryTree.Solution();
            LowestCommonAncestorBinaryTree.TreeNode p = new LowestCommonAncestorBinaryTree.TreeNode(1);
            LowestCommonAncestorBinaryTree.TreeNode q = new LowestCommonAncestorBinaryTree.TreeNode(2);
            assertNull(solution.lowestCommonAncestor(null, p, q));
        }


}


