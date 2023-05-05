package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
/** 
* LargestNumber Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class LargestNumberTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLargestNumber1() {
        LargestNumber.Solution sol = new LargestNumber.Solution();
        int[] nums = {10, 2};
        assertEquals("210", sol.largestNumber(nums));
    }

    @Test
    public void testLargestNumber2() {
        LargestNumber.Solution sol = new LargestNumber.Solution();
        int[] nums = {3, 30, 34, 5, 9};
        assertEquals("9534330", sol.largestNumber(nums));
    }

    @Test
    public void testLargestNumber3() {
        LargestNumber.Solution sol = new LargestNumber.Solution();
        int[] nums = {1};
        assertEquals("1", sol.largestNumber(nums));
    }

    @Test
    public void testLargestNumber4() {
        LargestNumber.Solution sol = new LargestNumber.Solution();
        int[] nums = {10};
        assertEquals("10", sol.largestNumber(nums));
    }

    @Test
    public void testLargestNumber5() {
        LargestNumber.Solution sol = new LargestNumber.Solution();
        int[] nums = {0, 0};
        assertEquals("0", sol.largestNumber(nums));
    }
}

