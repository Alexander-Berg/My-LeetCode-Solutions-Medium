package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* SortList Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class SortListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSortList() {
        // create a linked list: 4 -> 2 -> 1 -> 3
        SortList.ListNode head = new SortList.ListNode(4);
        head.next = new SortList.ListNode(2);
        head.next.next = new SortList.ListNode(1);
        head.next.next.next = new SortList.ListNode(3);

        SortList.Solution sortList = new SortList.Solution();
        SortList.ListNode sortedList = sortList.new sortList(head);

        // check that the linked list is sorted
        assertEquals(1, sortedList.val);
        assertEquals(2, sortedList.next.val);
        assertEquals(3, sortedList.next.next.val);
        assertEquals(4, sortedList.next.next.next.val);
    }

    @Test
    public void testSortListWithNull() {
        SortList.Solution sortList = new SortList.Solution();
        SortList.ListNode sortedList = sortList.new sortList(null);
        assertNull(sortedList);
    }

    @Test
    public void testSortListWithSingleElement() {
        SortList.ListNode head = new SortList.ListNode(1);
        SortList.Solution sortList = new SortList.Solution();
        SortList.ListNode sortedList = sortList.new sortList(head);
        assertEquals(1, sortedList.val);
    }

    @Test
    public void testSortListWithDuplicates() {
        // create a linked list: 4 -> 2 -> 1 -> 3 -> 2 -> 5
        SortList.ListNode head = new SortList.ListNode(4);
        head.next = new SortList.ListNode(2);
        head.next.next = new SortList.ListNode(1);
        head.next.next.next = new SortList.ListNode(3);
        head.next.next.next.next = new SortList.ListNode(2);
        head.next.next.next.next.next = new SortList.ListNode(5);

        SortList.Solution sortList = new SortList.Solution();
        SortList.ListNode sortedList = sortList.new sortList(head);

        // check that the linked list is sorted
        assertEquals(1, sortedList.val);
        assertEquals(2, sortedList.next.val);
        assertEquals(2, sortedList.next.next.val);
        assertEquals(3, sortedList.next.next.next.val);
        assertEquals(4, sortedList.next.next.next.next.val);
        assertEquals(5, sortedList.next.next.next.next.next.val);
    }

}

