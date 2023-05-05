package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* FindDuplicateNumber Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/




public class FindDuplicateNumberTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testFindDuplicate() {
        FindDuplicateNumber.Solution solution = new FindDuplicateNumber.Solution();

        int[] nums1 = {1, 3, 4, 2, 2};
        assertEquals(2, solution.findDuplicate(nums1));

        int[] nums2 = {3, 1, 3, 4, 2};
        assertEquals(3, solution.findDuplicate(nums2));

        int[] nums3 = {1, 1};
        assertEquals(1, solution.findDuplicate(nums3));

        int[] nums4 = {2, 2, 2, 2, 2};
        assertEquals(2, solution.findDuplicate(nums4));
    }
}

