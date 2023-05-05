package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* ValidateBinarySearchTree Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/


public class ValidateBinarySearchTreeTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testValidBST() {
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(2);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(3);
        ValidateBinarySearchTree.Solution sol = new ValidateBinarySearchTree.Solution();
        assertTrue(sol.isValidBST(root));
    }

    @Test
    public void testInvalidBST() {
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(4);
        root.right.left = new ValidateBinarySearchTree.TreeNode(3);
        root.right.right = new ValidateBinarySearchTree.TreeNode(6);
        ValidateBinarySearchTree.Solution sol = new ValidateBinarySearchTree.Solution();
        assertFalse(sol.isValidBST(root));
    }

    @Test
    public void testEmptyBST() {
        ValidateBinarySearchTree.TreeNode root = null;
        ValidateBinarySearchTree.Solution sol = new ValidateBinarySearchTree.Solution();
        assertTrue(sol.isValidBST(root));
    }

}

