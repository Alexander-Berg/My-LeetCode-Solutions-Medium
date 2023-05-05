package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
/** 
* BinaryTreeLevelOrderTraversal Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class BinaryTreeLevelOrderTraversalTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLevelOrderWithNullRoot() throws Exception {
        BinaryTreeLevelOrderTraversal.TreeNode root = null;
        BinaryTreeLevelOrderTraversal.Solution solution = new BinaryTreeLevelOrderTraversal.Solution();
        assertEquals(new ArrayList<List<Integer>>(), solution.levelOrder(root));
    }

    @Test
    public void testLevelOrderWithSingleNodeTree() throws Exception {
        BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(1);
        BinaryTreeLevelOrderTraversal.Solution solution = new BinaryTreeLevelOrderTraversal.Solution();
        List<List<Integer>> expectedOutput = new ArrayList<List<Integer>>();
        List<Integer> level1 = new ArrayList<Integer>();
        level1.add(1);
        expectedOutput.add(level1);
        assertEquals(expectedOutput, solution.levelOrder(root));
    }

    @Test
    public void testLevelOrderWithMultipleNodes() {
        BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(3);
        root.left = new BinaryTreeLevelOrderTraversal.TreeNode(9);
        root.right = new BinaryTreeLevelOrderTraversal.TreeNode(20);
        root.right.left = new BinaryTreeLevelOrderTraversal.TreeNode(15);
        root.right.right = new BinaryTreeLevelOrderTraversal.TreeNode(7);
        BinaryTreeLevelOrderTraversal.Solution solution = new BinaryTreeLevelOrderTraversal.Solution();
        List<List<Integer>> expectedOutput = new ArrayList<List<Integer>>();
        List<Integer> level1 = new ArrayList<Integer>();
        level1.add(3);
        expectedOutput.add(level1);
        List<Integer> level2 = new ArrayList<Integer>();
        level2.add(9);
        level2.add(20);
        expectedOutput.add(level2);
        List<Integer> level3 = new ArrayList<Integer>();
        level3.add(15);
        level3.add(7);
        expectedOutput.add(level3);
        assertEquals(expectedOutput, solution.levelOrder(root));
    }
}
