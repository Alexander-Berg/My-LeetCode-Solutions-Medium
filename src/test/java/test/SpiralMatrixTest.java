package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;
/** 
* SpiralMatrix Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/


public class SpiralMatrixTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSpiralOrder1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix.Solution solution = new SpiralMatrix.Solution();
        List<Integer> res = solution.spiralOrder(matrix);
        assertEquals(res.toString(), "[1, 2, 3, 6, 9, 8, 7, 4, 5]");
    }

    @Test
    public void testSpiralOrder2() {
        int[][] matrix = {{1}};
        SpiralMatrix.Solution solution = new SpiralMatrix.Solution();
        List<Integer> res = solution.spiralOrder(matrix);
        assertEquals(res.toString(), "[1]");
    }

    @Test
    public void testSpiralOrder3() {
        int[][] matrix = {{1,2},{3,4}};
        SpiralMatrix.Solution solution = new SpiralMatrix.Solution();
        List<Integer> res = solution.spiralOrder(matrix);
        assertEquals(res.toString(), "[1, 2, 4, 3]");
    }
}
