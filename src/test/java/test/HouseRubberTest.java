package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* HouseRubber Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class HouseRubberTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    private HouseRubber.Solution solution = new HouseRubber.Solution();

    @Test
    public void testRob_Example1() {
        int[] nums = {1,2,3,1};
        assertEquals(4, solution.rob(nums));
    }

    @Test
    public void testRob_Example2() {
        int[] nums = {2,7,9,3,1};
        assertEquals(12, solution.rob(nums));
    }

    @Test
    public void testRob_OneHouse() {
        int[] nums = {1};
        assertEquals(1, solution.rob(nums));
    }

    @Test
    public void testRob_EmptyArray() {
        int[] nums = {};
        assertEquals(0, solution.rob(nums));
    }

    @Test
    public void testRob_AllHousesAreSame() {
        int[] nums = {3,3,3,3,3,3};
        assertEquals(9, solution.rob(nums));
    }
}
