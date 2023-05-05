package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* FourSum Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class FourSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testFourSumCount1() {
        FourSum.Solution solution = new FourSum.Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        assertEquals(2, solution.fourSumCount(nums1, nums2, nums3, nums4));
    }
        @Test
        public void testFourSumCoun2() {
            FourSum.Solution solution = new FourSum.Solution();
            int[] nums5 = {-1, -1};
            int[] nums6 = {-1, 1};
            int[] nums7 = {-1, 1};
            int[] nums8 = {1, -1};

            assertEquals(6, solution.fourSumCount(nums5, nums6, nums7, nums8));
        }
            @Test
            public void testFourSumCount3() {
                FourSum.Solution solution = new FourSum.Solution();
        int[] nums9 = {1, 1, 1, 1};
        int[] nums10 = {1, 1, 1, 1};
        int[] nums11 = {1, 1, 1, 1};
        int[] nums12 = {1, 1, 1, 1};

        assertEquals(256, solution.fourSumCount(nums9, nums10, nums11, nums12));
    }
}
