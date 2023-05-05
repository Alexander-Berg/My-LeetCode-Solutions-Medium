package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
/** 
* Subsets Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class SubsetsTest {
    Subsets.Solution solution = new Subsets.Solution();
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSubsets_emptyArray() {

        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList());
        List<List<Integer>> result = new Subsets.Solution().subsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSubsets_oneElement() {
        Subsets.Solution solution = new Subsets.Solution();
        int[] nums = {1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(), Arrays.asList(1));
        List<List<Integer>> result = new Subsets.Solution().subsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSubsets_multipleElements() {

        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2),
                Arrays.asList(2, 3),
                Arrays.asList(3)
        );
        List<List<Integer>> result = new Subsets.Solution().subsets(nums);
        assertEquals(expected, result);
    }
}
