package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* RotateArray Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class RotateArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }



    @Test
    public void testRotateExample1() {
        RotateArray.Solution sol = new RotateArray.Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }

    @Test
    public void testRotateExample2() {
        RotateArray.Solution sol = new RotateArray.Solution();
        int[] nums = {-1,-100,3,99};
        int k = 2;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{3,99,-1,-100}, nums);
    }

    @Test
    public void testRotateEmptyArray() {
        RotateArray.Solution sol = new RotateArray.Solution();
        int[] nums = {};
        int k = 2;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void testRotateSingleElementArray() {
        RotateArray.Solution sol = new RotateArray.Solution();
        int[] nums = {1};
        int k = 2;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    public void testRotateKGreaterThanArrayLength() {
        RotateArray.Solution sol = new RotateArray.Solution();
        int[] nums = {1,2,3};
        int k = 4;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{3,1,2}, nums);
    }
}
