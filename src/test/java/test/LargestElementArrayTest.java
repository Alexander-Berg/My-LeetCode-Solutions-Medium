package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* LargestElementArray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class LargestElementArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception{
    }

    @Test
    public void testFindKthLargest() {
        LargestElementArray.Solution sol = new LargestElementArray.Solution();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        int result1 = sol.findKthLargest(nums1, k1);
        assertEquals(5, result1);
    }
        @Test
        public void testFindKthLargest2() {
            LargestElementArray.Solution sol = new LargestElementArray.Solution();

            int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
            int k2 = 4;
            int result2 = sol.findKthLargest(nums2, k2);
            assertEquals(4, result2);
        }
            @Test
            public void testFindKthLargest3() {
                LargestElementArray.Solution sol = new LargestElementArray.Solution();

                int[] nums3 = {1};
                int k3 = 1;
                int result3 = sol.findKthLargest(nums3, k3);
                assertEquals(1, result3);
            }
    @Test
    public void testFindKthLargest4() {
        LargestElementArray.Solution sol = new LargestElementArray.Solution();

        int[] nums4 = {1,1,1,1};
        int k4 = 2;
        int result4 = sol.findKthLargest(nums4, k4);
        assertEquals(1, result4);
    }
}

