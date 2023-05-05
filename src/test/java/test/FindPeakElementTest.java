package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
* FindPeakElement Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/




public class FindPeakElementTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testFindPeakElement() {
        FindPeakElement.Solution solution = new FindPeakElement.Solution();

        // Test case 1: Input array is [1,2,3,1] and the output should be 2.
        int[] nums1 = {1, 2, 3, 1};
        int expected1 = 2;
        int result1 = solution.findPeakElement(nums1);
        assertEquals(expected1, result1);
    }
        @Test
        public void testFindPeakElement2() {
            FindPeakElement.Solution solution = new FindPeakElement.Solution();

            // Test case 2: Input array is [1,2,1,3,5,6,4] and the output should be 5.
            int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
            int expected2 = 5;
            int result2 = solution.findPeakElement(nums2);
            assertEquals(expected2, result2);
        }
            @Test
            public void testFindPeakElement3() {
                FindPeakElement.Solution solution = new FindPeakElement.Solution();

        // Test case 3: Input array is [1,2,3,4,5,6,7] and the output can be any index from 0 to 6.
        int[] nums3 = {1,2,3,4,5,6,7};
        int expected3 = 0;
        int result3 = solution.findPeakElement(nums3);
        assertTrue(result3 >= 0 && result3 <= 6);
    }
}
