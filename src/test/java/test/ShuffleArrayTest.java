package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* ShuffleArray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class ShuffleArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testShuffle() {
        int[] nums = {1, 2, 3};
        ShuffleArray.Solution obj = new ShuffleArray.Solution(nums);
        int[] shuffled = obj.shuffle();
        assertNotEquals(nums, shuffled); // shuffled array should be different from the original
        assertArrayEquals(nums, obj.reset()); // reset should return the original array
    }

    @Test
    public void testRandomIndex() {
        int start = 0, end = 10;
        ShuffleArray.Solution obj = new ShuffleArray.Solution(new int[0]);
        int randomIndex = obj.getRandomIndex(start, end);
        assertTrue(randomIndex >= start && randomIndex <= end); // random index should be within range
    }
}

