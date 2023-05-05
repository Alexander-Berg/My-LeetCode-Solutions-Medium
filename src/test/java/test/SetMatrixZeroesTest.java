package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;
/** 
* SetMatrixZeroes Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class SetMatrixZeroesTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSetZeroes() {
        SetMatrixZeroes.Solution solution = new SetMatrixZeroes.Solution();

        // Test case 1
        int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
        solution.setZeroes(matrix1);
        int[][] expected1 = {{1,0,1},{0,0,0},{1,0,1}};
        Assert.assertArrayEquals(expected1, matrix1);

        // Test case 2
        int[][] matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(matrix2);
        int[][] expected2 = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        Assert.assertArrayEquals(expected2, matrix2);
    }
}

