package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

/** 
* TopKFrequentElements Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class TopKFrequentElementsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testTopKFrequent() {
        TopKFrequentElements.Solution sol = new TopKFrequentElements.Solution();

        int[] nums1 = {1,1,1,2,2,3};
        int[] expected1 = {1,2};
        assertArrayEquals(expected1, sol.topKFrequent(nums1, 2));

        int[] nums2 = {1};
        int[] expected2 = {1};
        assertArrayEquals(expected2, sol.topKFrequent(nums2, 1));

        int[] nums3 = {1,2,3,4,5};
        int[] expected3 = {1,2,3,4,5};
        assertArrayEquals(expected3, sol.topKFrequent(nums3, 5));
    }
}
