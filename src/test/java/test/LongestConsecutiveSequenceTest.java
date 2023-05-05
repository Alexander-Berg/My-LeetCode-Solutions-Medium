package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* LongestConsecutiveSequence Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class LongestConsecutiveSequenceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLongestConsecutive() {
        LongestConsecutiveSequence.Solution solution = new LongestConsecutiveSequence.Solution();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        assertEquals(4, solution.longestConsecutive(nums1));
    }
        @Test
        public void testLongestConsecutive2() {
            LongestConsecutiveSequence.Solution solution = new LongestConsecutiveSequence.Solution();
            int[] nums2 = {0, -1};
            assertEquals(2, solution.longestConsecutive(nums2));
        }
            @Test
            public void testLongestConsecutive3() {
                LongestConsecutiveSequence.Solution solution = new LongestConsecutiveSequence.Solution();
                int[] nums3 = {1, 2, 0, 1};
                assertEquals(3, solution.longestConsecutive(nums3));
            }
                @Test
                public void testLongestConsecutive4() {
                    LongestConsecutiveSequence.Solution solution = new LongestConsecutiveSequence.Solution();
        int[] nums4 = {};
        assertEquals(0, solution.longestConsecutive(nums4));
    }
}
