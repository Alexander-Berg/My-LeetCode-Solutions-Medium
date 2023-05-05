package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* SearchRotatedSortedArray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchRotatedSortedArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSearch() {
        SearchRotatedSortedArray.Solution sol = new SearchRotatedSortedArray.Solution();
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, sol.search(nums1, 0));
        assertEquals(-1, sol.search(nums1, 3));
        int[] nums2 = {1};
        assertEquals(0, sol.search(nums2, 1));
        assertEquals(-1, sol.search(nums2, 0));
        int[] nums3 = {3, 5, 1};
        assertEquals(1, sol.search(nums3, 5));
        assertEquals(-1, sol.search(nums3, 0));
    }
}



