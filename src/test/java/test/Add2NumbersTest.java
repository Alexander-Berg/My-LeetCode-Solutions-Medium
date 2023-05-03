import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0


public class Add2NumbersTest {

    @Test
    public void testAddTwoNumbersEmpty() {
        Add2Numbers add2Numbers = new Add2Numbers();
        Add2Numbers.ListNode ListNode = new ListNode();
        ListNode result = add2Numbers.addTwoNumbers(null, null);
        assertNull(result);
    }

    @Test
    public void testAddTwoNumbersOneNull() {
        Add2Numbers add2Numbers = new Add2Numbers();
        ListNode l1 = new ListNode(2);
        ListNode l2 = null;
        ListNode result = add2Numbers.addTwoNumbers(l1, l2);
        assertEquals(2, result.val);
        assertNull(result.next);
    }

    @Test
    public void testAddTwoNumbersSameLength() {
        Add2Numbers add2Numbers = new Add2Numbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = add2Numbers.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testAddTwoNumbersDifferentLength() {
        Add2Numbers add2Numbers = new Add2Numbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = add2Numbers.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }
}
*/

