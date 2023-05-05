package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
* PopulatingNextRightPointersEachNode Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

    public class PopulatingNextRightPointersEachNodeTest {

        @Before
        public void before() throws Exception {
        }

        @After
        public void after() throws Exception {
        }


        @Test
        public void testConnect() {
            // Create a tree with the following structure:
            //        1
            //      /   \
            //     2     3
            //    / \   / \
            //   4   5 6   7
            PopulatingNextRightPointersEachNode.Node root = new PopulatingNextRightPointersEachNode.Node(1,
                    new PopulatingNextRightPointersEachNode.Node(2, new PopulatingNextRightPointersEachNode.Node(4), new PopulatingNextRightPointersEachNode.Node(5), null),
                    new PopulatingNextRightPointersEachNode.Node(3, new PopulatingNextRightPointersEachNode.Node(6), new PopulatingNextRightPointersEachNode.Node(7), null),
                    null);

            // Call the connect() method to populate next pointers
            new PopulatingNextRightPointersEachNode.Solution().connect(root);

            // Assert that the next pointers are set correctly
            assertEquals(root.left.next, root.right);
            assertEquals(root.left.left.next, root.left.right);
            assertEquals(root.left.right.next, root.right.left);
            assertEquals(root.right.left.next, root.right.right);
            assertNull(root.right.right.next);
        }
    }


