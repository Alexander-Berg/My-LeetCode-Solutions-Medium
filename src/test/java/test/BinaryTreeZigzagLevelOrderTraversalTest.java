package test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;


/**


 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0
 */




public class BinaryTreeZigzagLevelOrderTraversalTest     {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testNumDecodingsDP()    throws Exception{
        BinaryTreeZigzagLevelOrderTraversal.Solution sol = new BinaryTreeZigzagLevelOrderTraversal.Solution();
        assertEquals(2, sol.numDecodings("12"));
        assertEquals(3, sol.numDecodings("226"));
        assertEquals(0, sol.numDecodings("0"));
        assertEquals(0, sol.numDecodings("06"));
        assertEquals(0, sol.numDecodings("60"));
        assertEquals(1, sol.numDecodings("27"));
        assertEquals(0, sol.numDecodings("270"));
    }

//     @Test
//     public void testNumDecodingsRecursive() {
//         BinaryTreeZigzagLevelOrderTraversal.Solution sol = new BinaryTreeZigzagLevelOrderTraversal().new Solution();
//         assertEquals(2, sol.numDecodings("12"));
//         assertEquals(3, sol.numDecodings("226"));
//         assertEquals(0, sol.numDecodings("0"));
//         assertEquals(0, sol.numDecodings("06"));
//         assertEquals(0, sol.numDecodings("60"));
//         assertEquals(1, sol.numDecodings("27"));
//         assertEquals(0, sol.numDecodings("270"));
//     }
}
