package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* WiggleSort Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class WiggleSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testWiggleSort() {
        WiggleSort.Solution solution = new WiggleSort.Solution();

        // Test case 1
        int[] nums1 = {1, 5, 1, 1, 6, 4};
        solution.wiggleSort(nums1);
        int[] expected1 = {1, 4, 1, 5, 1, 6};
        assertArrayEquals(expected1, nums1);
    }
        @Test
        public void testWiggleSort2() {
            WiggleSort.Solution solution = new WiggleSort.Solution();
            // Test case 2
            int[] nums2 = {3, 5, 2, 1, 6, 4};
            solution.wiggleSort(nums2);
            int[] expected2 = {2, 5, 1, 6, 3, 4};
            assertArrayEquals(expected2, nums2);
        }
            @Test
            public void testWiggleSort3() {
                WiggleSort.Solution solution = new WiggleSort.Solution();
        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7};
        solution.wiggleSort(nums3);
        int[] expected3 = {1, 7, 2, 6, 3, 5, 4};
        assertArrayEquals(expected3, nums3);
    }
}
