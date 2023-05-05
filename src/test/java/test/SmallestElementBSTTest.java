package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;

/** 
* SmallestElementBST Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class SmallestElementBSTTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testKthSmallest() {
        SmallestElementBST.TreeNode root = new SmallestElementBST.TreeNode(3);
        root.left = new SmallestElementBST.TreeNode(1);
        root.right = new SmallestElementBST.TreeNode(4);
        root.left.right = new SmallestElementBST.TreeNode(2);

        SmallestElementBST.Solution solution = new SmallestElementBST.Solution();

        assertEquals(1, solution.kthSmallest(root, 1));
        assertEquals(2, solution.kthSmallest(root, 2));
        assertEquals(3, solution.kthSmallest(root, 3));
        assertEquals(4, solution.kthSmallest(root, 4));
        assertEquals(-1, solution.kthSmallest(root, 5));
    }
}




