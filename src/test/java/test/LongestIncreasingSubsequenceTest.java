package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* LongestIncreasingSubsequence Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class LongestIncreasingSubsequenceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence.Solution solution = new LongestIncreasingSubsequence.Solution();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, solution.lengthOfLIS(nums1));
    }
        @Test
        public void testLengthOfLIS2() {
            LongestIncreasingSubsequence.Solution solution = new LongestIncreasingSubsequence.Solution();

            int[] nums2 = {0, 1, 0, 3, 2, 3};
            assertEquals(4, solution.lengthOfLIS(nums2));
        }
            @Test
            public void testLengthOfLIS3() {
                LongestIncreasingSubsequence.Solution solution = new LongestIncreasingSubsequence.Solution();
        int[] nums3 = {7,7,7,7,7,7,7};
        assertEquals(1, solution.lengthOfLIS(nums3));
    }
}
