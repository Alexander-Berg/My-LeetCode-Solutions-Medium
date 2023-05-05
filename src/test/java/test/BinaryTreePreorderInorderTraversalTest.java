package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
* BinaryTreePreorderInorderTraversal Tester. 
* @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 


public class BinaryTreePreorderInorderTraversalTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void test1 () throws Exception {
        Object BinaryTreePreorderInorderTraversal = null;
        BinaryTreePreorderInorderTraversal.TreeNode = new BinaryTreePreorderInorderTraversal.TreeNode();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(3);
        root.left = bTree.new TreeNode(9);
        root.right = bTree.new TreeNode(20);
        root.right.left = bTree.new TreeNode(15);
        root.right.right = bTree.new TreeNode(7);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

    @Test
    public void test2() throws Exception {
        Object BinaryTreePreorderInorderTraversal = null;
        BinaryTreePreorderInorderTraversal.bTree = new BinaryTreePreorderInorderTraversal();
        int[] preorder = {1,2,3};
        int[] inorder = {3,2,1};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(1);
        root.left = bTree.new TreeNode(2);
        root.left.left = bTree.new TreeNode(3);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

    @Test
    public void test3() throws Exception {
        BinaryTreePreorderInorderTraversal bTree = new BinaryTreePreorderInorderTraversal();
        int[] preorder = {1,2};
        int[] inorder = {2,1};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(1);
        root.left = bTree.new TreeNode(2);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

    @Test
    public void test4() throws Exception {
        BinaryTreePreorderInorderTraversal bTree = new BinaryTreePreorderInorderTraversal();
        int[] preorder = {1,2};
        int[] inorder = {1,2};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(1);
        root.right = bTree.new TreeNode(2);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

    @Test
    public void test5() throws Exception {
        BinaryTreePreorderInorderTraversal bTree = new BinaryTreePreorderInorderTraversal();
        int[] preorder = {1};
        int[] inorder = {1};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(1);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

    @Test
    public void test6() throws Exception {
        BinaryTreePreorderInorderTraversal bTree = new BinaryTreePreorderInorderTraversal();
        int[] preorder = {3,2,1};
        int[] inorder = {3,2,1};
        BinaryTreePreorderInorderTraversal.TreeNode root = bTree.new TreeNode(3);
        root.left = bTree.new TreeNode(2);
        root.left.left = bTree.new TreeNode(1);
        assertEquals(root.val, bTree.buildTree(preorder, inorder).val);
    }

}
 */