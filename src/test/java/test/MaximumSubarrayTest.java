package test;

import  org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;

/** 
* MaximumSubarray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class MaximumSubarrayTest {
    MaximumSubarray.Solution solution = new MaximumSubarray.Solution();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMaxSubArray_Example1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_Example2() {
        int[] nums = {1};
        int expected = 1;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_Example3() {
        int[] nums = {0};
        int expected = 0;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_Example4() {
        int[] nums = {-1};
        int expected = -1;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_AllNegative() {
        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        int expected = -1;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_AllPositive() {
        int[] nums = {2,1,3,4,1,2,1,5,4};
        int expected = 23;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_WithZero() {
        int[] nums = {-2,1,-3,4,-1,0,1,-5,4};
        int expected = 4;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxSubArray_AllZero() {
        int[] nums = {0,0,0,0,0,0};
        int expected = 0;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }
}

