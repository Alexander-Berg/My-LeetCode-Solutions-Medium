package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* JumpGame Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class JumpGameTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testCanJump_returnsTrue() {
        JumpGame.Solution solution = new JumpGame.Solution();
        int[] nums = {2,3,1,1,4};
        assertTrue(solution.canJump(nums));
    }

    @Test
    public void testCanJump_returnsFalse() {
        JumpGame.Solution solution = new JumpGame.Solution();
        int[] nums = {3,2,1,0,4};
        assertFalse(solution.canJump(nums));
    }

    @Test
    public void testCanJump_singleElementArray() {
        JumpGame.Solution solution = new JumpGame.Solution();
        int[] nums = {0};
        assertTrue(solution.canJump(nums));
    }

    @Test
    public void testCanJump_emptyArray() {
        JumpGame.Solution solution = new JumpGame.Solution();
        int[] nums = {};
        assertTrue(solution.canJump(nums));
    }
}

