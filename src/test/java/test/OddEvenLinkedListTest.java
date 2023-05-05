package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* OddEvenLinkedList Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class OddEvenLinkedListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testOddEvenList_nullInput() {
        OddEvenLinkedList.Solution solution = new OddEvenLinkedList.Solution();
        assertNull(solution.oddEvenList(null));
    }

    @Test
    public void testOddEvenList_singleNode() {
        OddEvenLinkedList.Solution solution = new OddEvenLinkedList.Solution();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        OddEvenLinkedList.ListNode result = solution.oddEvenList(head);
        assertEquals(head, result);
    }

    @Test
    public void testOddEvenList_twoNodes() {
        OddEvenLinkedList.Solution solution = new OddEvenLinkedList.Solution();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        OddEvenLinkedList.ListNode node2 = new OddEvenLinkedList.ListNode(2);
        head.next = node2;
        OddEvenLinkedList.ListNode result = solution.oddEvenList(head);
        assertEquals(head, result);
    }

    @Test
    public void testOddEvenList_threeNodes() {
        OddEvenLinkedList.Solution solution = new OddEvenLinkedList.Solution();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        OddEvenLinkedList.ListNode node2 = new OddEvenLinkedList.ListNode(2);
        OddEvenLinkedList.ListNode node3 = new OddEvenLinkedList.ListNode(3);
        head.next = node2;
        node2.next = node3;
        OddEvenLinkedList.ListNode result = solution.oddEvenList(head);
        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(2, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testOddEvenList_fourNodes() {
        OddEvenLinkedList.Solution solution = new OddEvenLinkedList.Solution();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        OddEvenLinkedList.ListNode node2 = new OddEvenLinkedList.ListNode(2);
        OddEvenLinkedList.ListNode node3 = new OddEvenLinkedList.ListNode(3);
        OddEvenLinkedList.ListNode node4 = new OddEvenLinkedList.ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        OddEvenLinkedList.ListNode result = solution.oddEvenList(head);
        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }
}


