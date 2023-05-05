package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
/** 
* DeleteNodeLinkedList Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/



public class DeleteNodeLinkedListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testDeleteNode() {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        DeleteNodeLinkedList.ListNode node1 = new DeleteNodeLinkedList.ListNode(1);
        DeleteNodeLinkedList.ListNode node2 = new DeleteNodeLinkedList.ListNode(2);
        DeleteNodeLinkedList.ListNode node3 = new DeleteNodeLinkedList.ListNode(3);
        DeleteNodeLinkedList.ListNode node4 = new DeleteNodeLinkedList.ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Delete node 2
        new DeleteNodeLinkedList.Solution().deleteNode(node2);

        // Verify the linked list is now: 1 -> 3 -> 4
        assertEquals(1, node1.val);
        assertEquals(3, node2.val);
        assertEquals(4, node3.val);
        assertNull(node4.next);
    }
}
