package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* FactorialTrailingZeroes Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class FactorialTrailingZeroesTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testTrailingZeroes() {
        FactorialTrailingZeroes.Solution solution = new FactorialTrailingZeroes.Solution();
        assertEquals(0, solution.trailingZeroes(0));
        assertEquals(0, solution.trailingZeroes(4));
        assertEquals(1, solution.trailingZeroes(5));
        assertEquals(2, solution.trailingZeroes(10));
        assertEquals(24, solution.trailingZeroes(100));
        assertEquals(2499999, solution.trailingZeroes(10000000));
    }
}
