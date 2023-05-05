package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* Search2DMatrix Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class Search2DMatrixTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSearchMatrix() {
        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target1 = 3;
        assertTrue(new Search2DMatrix.Solution().searchMatrix(matrix1, target1));

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target2 = 13;
        assertFalse(new Search2DMatrix.Solution().searchMatrix(matrix2, target2));

        int[][] matrix3 = {{1, 3}, {10, 11}, {23, 30}};
        int target3 = 3;
        assertTrue(new Search2DMatrix.Solution().searchMatrix(matrix3, target3));

        int[][] matrix4 = {{}};
        int target4 = 5;
        assertFalse(new Search2DMatrix.Solution().searchMatrix(matrix4, target4));

        int[][] matrix5 = {{5}};
        int target5 = 5;
        assertTrue(new Search2DMatrix.Solution().searchMatrix(matrix5, target5));
    }
}
