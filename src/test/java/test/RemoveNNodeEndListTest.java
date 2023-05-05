package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* RemoveNNodeEndList Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

    public class RemoveNNodeEndListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
        @Test
        public void testRemoveNthFromEnd() {
            // Create a linked list with nodes 1->2->3->4->5
            RemoveNNodeEndList.ListNode head = new RemoveNNodeEndList.ListNode(1);
            head.next = new RemoveNNodeEndList.ListNode(2);
            head.next.next = new RemoveNNodeEndList.ListNode(3);
            head.next.next.next = new RemoveNNodeEndList.ListNode(4);
            head.next.next.next.next = new RemoveNNodeEndList.ListNode(5);

            // Remove the 2nd node from the end (node with value 4)
            RemoveNNodeEndList.Solution solution = new RemoveNNodeEndList.Solution();
            RemoveNNodeEndList.ListNode result = solution.removeNthFromEnd(head, 2);

            // Check that the linked list is now 1->2->3->5
            assertEquals(1, result.val);
            assertEquals(2, result.next.val);
            assertEquals(3, result.next.next.val);
            assertEquals(5, result.next.next.next.val);
            assertNull(result.next.next.next.next);

            // Remove the last node (node with value 5)
            result = solution.removeNthFromEnd(result, 1);

            // Check that the linked list is now 1->2->3
            assertEquals(1, result.val);
            assertEquals(2, result.next.val);
            assertEquals(3, result.next.next.val);
            assertNull(result.next.next.next);

            // Remove the first node (node with value 1)
            result = solution.removeNthFromEnd(result, 2);

            // Check that the linked list is now 2->3
            assertEquals(2, result.val);
            assertEquals(3, result.next.val);
            assertNull(result.next.next);

            // Try to remove a node that is beyond the length of the linked list
            result = solution.removeNthFromEnd(result, 3);

            // Check that the linked list is unchanged
            assertEquals(2, result.val);
            assertEquals(3, result.next.val);
            assertNull(result.next.next);
        }
    }


