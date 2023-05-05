package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* ThreeSUM Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/


        import org.junit.Test;
        import static org.junit.Assert.*;
        import java.util.*;

public class ThreeSUMTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testThreeSum() {
        ThreeSUM.Solution threeSum = new ThreeSUM.Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumNoResult() {
        ThreeSUM.Solution threeSum = new ThreeSUM.Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumAllZeroes() {
        ThreeSUM.Solution threeSum = new ThreeSUM.Solution();
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));
        assertEquals(expected, result);
    }

}
