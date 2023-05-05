package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0
 */

public class ContainerMostWaterTest {


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testMaxArea() {
        ContainerMostWater.Solution solution = new ContainerMostWater.Solution();

        // Test case 1: non-empty array
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49;
        int result1 = solution.maxArea(height1);
        assertEquals(expected1, result1);
    }
    @Test
    public void testMaxArea2() {
    ContainerMostWater.Solution solution = new ContainerMostWater.Solution();
    // Test case 2: empty array
    int[] height2 = {};
    int expected2 = 0;
    int result2 = solution.maxArea(height2);
    assertEquals(expected2, result2);

}    @Test
    public void testMaxArea3() {
        ContainerMostWater.Solution solution = new ContainerMostWater.Solution();
        // Test case 3: array with one element
        int[] height3 = {5};
        int expected3 = 0;
        int result3 = solution.maxArea(height3);
        assertEquals(expected3, result3);
            }
    @Test
    public void testMaxArea4() {
        ContainerMostWater.Solution solution = new ContainerMostWater.Solution();
        // Test case 4: array with two elements
        int[] height4 = {5, 7};
        int expected4 = 5;
        int result4 = solution.maxArea(height4);
        assertEquals(expected4, result4);
                }
    @Test
    public void testMaxArea5() {
        ContainerMostWater.Solution solution = new ContainerMostWater.Solution();
        // Test case 5: array with multiple maximum areas
        int[] height5 = {3, 2, 1, 4, 5, 6, 7, 4};
        int expected5 = 21;
        int result5 = solution.maxArea(height5);
        assertEquals(expected5, result5);
    }
}
