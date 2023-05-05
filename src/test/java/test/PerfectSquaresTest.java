package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* PerfectSquares Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class PerfectSquaresTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testNumSquares_1() {
        PerfectSquares.Solution solution = new PerfectSquares.Solution();
        int result = solution.numSquares(12);
        assertEquals(3, result);
    }

    @Test
    public void testNumSquares_2() {
        PerfectSquares.Solution solution = new PerfectSquares.Solution();
        int result = solution.numSquares(13);
        assertEquals(2, result);
    }

    @Test
    public void testNumSquares_3() {
        PerfectSquares.Solution solution = new PerfectSquares.Solution();
        int result = solution.numSquares(4);
        assertEquals(1, result);
    }

    @Test
    public void testNumSquares_4() {
        PerfectSquares.Solution solution = new PerfectSquares.Solution();
        int result = solution.numSquares(1);
        assertEquals(1, result);
    }
}

