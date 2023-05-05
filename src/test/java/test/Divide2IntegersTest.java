package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
/** 
* Divide2Integers Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class Divide2IntegersTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testDividePositiveNumbers() {
        Divide2Integers.Solution solution = new Divide2Integers.Solution();
        int dividend = 10;
        int divisor = 3;
        int expected = 3;
        int result = solution.divide(dividend, divisor);
        assertEquals(expected, result);
    }

    @Test
    public void testDivideNegativeNumbers() {
        Divide2Integers.Solution solution = new Divide2Integers.Solution();
        int dividend = -10;
        int divisor = 3;
        int expected = -3;
        int result = solution.divide(dividend, divisor);
        assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero() {
        Divide2Integers.Solution solution = new Divide2Integers.Solution();
        int dividend = 10;
        int divisor = 0;
        int expected = Integer.MAX_VALUE;
        int result = solution.divide(dividend, divisor);
        assertEquals(expected, result);
    }

    @Test
    public void testDivideWithLargeNumbers() {
        Divide2Integers.Solution solution = new Divide2Integers.Solution();
        int dividend = 2147483647;
        int divisor = 2;
        int expected = 1073741823;
        int result = solution.divide(dividend, divisor);
        assertEquals(expected, result);
    }
}
