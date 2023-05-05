package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertArrayEquals;

/** 
* SortColors Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 


public class SortColorsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }



        @Test
        public void testSortColors() {
            SortColors sortColors = new SortColors();
            int[] nums = {2,0,2,1,1,0};
            sortColors.new Solution().sortColors(nums);
            assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);

            nums = new int[]{2,0,1};
            sortColors.new Solution().sortColors(nums);
            assertArrayEquals(new int[]{0,1,2}, nums);

            nums = new int[]{0};
            sortColors.new Solution().sortColors(nums);
            assertArrayEquals(new int[]{0}, nums);

            nums = new int[]{1};
            sortColors.new Solution().sortColors(nums);
            assertArrayEquals(new int[]{1}, nums);
        }
    }
 */
