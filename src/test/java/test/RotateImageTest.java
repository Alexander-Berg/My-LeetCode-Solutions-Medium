package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* RotateImage Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class RotateImageTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testRotate3x3() {
        RotateImage.Solution sol = new RotateImage.Solution();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] expected = {{7,4,1}, {8,5,2}, {9,6,3}};
        sol.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotate4x4() {
        RotateImage.Solution sol = new RotateImage.Solution();
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int[][] expected = {{13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4}};
        sol.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotate1x1() {
        RotateImage.Solution sol = new RotateImage.Solution();
        int[][] matrix = {{1}};
        int[][] expected = {{1}};
        sol.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}
