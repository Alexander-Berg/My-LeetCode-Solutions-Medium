package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* MaximumProductSubarray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class MaximumProductSubarrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testMaxProductWithPositiveNumbers() {
        MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
        int[] nums = {1, 2, 3, 4};
        int expected = 24;
        int actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProductWithNegativeNumbers() {
        MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
        int[] nums = {-2, -3, -4, -5};
        int expected = 60;
        int actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProductWithZero() {
        MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
        int[] nums = {1, 2, 0, 3, 4};
        int expected = 12;
        int actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProductWithOneElement() {
        MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
        int[] nums = {5};
        int expected = 5;
        int actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProductWithMixedNumbers() {
        MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
        int[] nums = {2, -5, 3, -4};
        int expected = 60;
        int actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

}
