package test;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0
 */

public class CopyListRandomPointerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testCopyRandomList() {
        // Create a linked list with 3 nodes and set random pointers
        CopyListRandomPointer.Node head = new CopyListRandomPointer.Node(1);
        CopyListRandomPointer.Node node2 = new CopyListRandomPointer.Node(2);
        CopyListRandomPointer.Node node3 = new CopyListRandomPointer.Node(3);
        head.next = node2;
        node2.next = node3;
        head.random = node3;
        node2.random = head;
        node3.random = node2;

        // Copy the linked list
        CopyListRandomPointer.Solution solution = new CopyListRandomPointer.Solution();
        CopyListRandomPointer.Node copy = solution.copyRandomList(head);

        // Verify that the copied linked list is correct
        assertEquals(head.val, copy.val);
        assertNotNull(copy.next);
        assertEquals(head.next.val, copy.next.val);
        assertNotNull(copy.next.next);
        assertEquals(node3.val, copy.next.next.val);
        assertNull(copy.next.next.next);

        // Verify that the random pointers are correctly copied
        assertNotSame(head.random, copy.random);
        assertEquals(head.random.val, copy.random.val);
        assertNotSame(node2.random, copy.next.random);
        assertEquals(node2.random.val, copy.next.random.val);
        assertNotSame(node3.random, copy.next.next.random);
        assertEquals(node3.random.val, copy.next.next.random.val);
    }

    @Test
    public void testCopyRandomList_NullInput() {
        // Test the method with a null input
        CopyListRandomPointer.Solution solution = new CopyListRandomPointer.Solution();
        CopyListRandomPointer.Node copy = solution.copyRandomList(null);
        assertNull(copy);
    }

    // Add more test cases here as needed
}
