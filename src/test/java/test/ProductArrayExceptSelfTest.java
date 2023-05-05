package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertArrayEquals;
/** 
* ProductArrayExceptSelf Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class ProductArrayExceptSelfTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testProductExceptSelfWithZeroes() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, new ProductArrayExceptSelf.Solution().productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelfWithSingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        assertArrayEquals(expected, new ProductArrayExceptSelf.Solution().productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelfWithMultipleElements() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, new ProductArrayExceptSelf.Solution().productExceptSelf(nums));
    }
}

