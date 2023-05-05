package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/** 
* Permutations Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class PermutationsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testPermute() {
        Permutations.Solution solution = new Permutations.Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 2, 3));
        expected1.add(Arrays.asList(1, 3, 2));
        expected1.add(Arrays.asList(2, 1, 3));
        expected1.add(Arrays.asList(2, 3, 1));
        expected1.add(Arrays.asList(3, 2, 1));
        expected1.add(Arrays.asList(3, 1, 2));
        List<List<Integer>> actual1 = solution.permute(nums1);
        Assert.assertEquals(expected1, actual1);
    }
        @Test
        public void testPermute2() {
            Permutations.Solution solution = new Permutations.Solution();
            // Test case 2
            int[] nums2 = {0, 1};
            List<List<Integer>> expected2 = new ArrayList<>();
            expected2.add(Arrays.asList(0, 1));
            expected2.add(Arrays.asList(1, 0));
            List<List<Integer>> actual2 = solution.permute(nums2);
            Assert.assertEquals(expected2, actual2);
        }
    @Test
    public void testPermute3() {
        Permutations.Solution solution = new Permutations.Solution();
        // Test case 3
        int[] nums3 = {1};
        List<List<Integer>> expected3 = new ArrayList<>();
        expected3.add(Arrays.asList(1));
        List<List<Integer>> actual3 = solution.permute(nums3);
        Assert.assertEquals(expected3, actual3);
    }
}

