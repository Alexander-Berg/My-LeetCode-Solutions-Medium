package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* FirstLastPositionElementSortedArray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class FirstLastPositionElementSortedArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSearchRange() {
        FirstLastPositionElementSortedArray.Solution solution = new FirstLastPositionElementSortedArray.Solution();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] expectedOutput1 = {3, 4};
        assertArrayEquals(expectedOutput1, solution.searchRange(nums1, target1));
    }
    @Test
    public void testSearchRange2() {
            FirstLastPositionElementSortedArray.Solution solution = new FirstLastPositionElementSortedArray.Solution();
            int[] nums2 = {5, 7, 7, 8, 8, 10};
            int target2 = 6;
            int[] expectedOutput2 = {-1, -1};
            assertArrayEquals(expectedOutput2, solution.searchRange(nums2, target2));
        }
    @Test
    public void testSearchRange3() {
                FirstLastPositionElementSortedArray.Solution solution = new FirstLastPositionElementSortedArray.Solution();
                int[] nums3 = {};
                int target3 = 0;
                int[] expectedOutput3 = {-1, -1};
                assertArrayEquals(expectedOutput3, solution.searchRange(nums3, target3));
            }
    @Test
    public void testSearchRange4() {
                    FirstLastPositionElementSortedArray.Solution solution = new FirstLastPositionElementSortedArray.Solution();
        int[] nums4 = {1, 2, 2};
        int target4 = 2;
        int[] expectedOutput4 = {1, 2};
        assertArrayEquals(expectedOutput4, solution.searchRange(nums4, target4));
    }
}
