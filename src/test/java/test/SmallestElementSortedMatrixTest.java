package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* SmallestElementSortedMatrix Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/
public class SmallestElementSortedMatrixTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testKthSmallest() {
        SmallestElementSortedMatrix.Solution solution = new SmallestElementSortedMatrix.Solution();

        int[][] matrix1 = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        assertEquals(13, solution.kthSmallest(matrix1, 8));

        int[][] matrix2 = {{-5}};
        assertEquals(-5, solution.kthSmallest(matrix2, 1));

        int[][] matrix3 = {{1, 2}, {3, 4}};
        assertEquals(1, solution.kthSmallest(matrix3, 1));

        int[][] matrix4 = {{1, 2}, {3, 4}};
        assertEquals(4, solution.kthSmallest(matrix4, 4));
    }
}

