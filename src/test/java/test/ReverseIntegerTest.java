package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* ReverseInteger Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testReversePositiveNumber() {
        ReverseInteger.Solution solution = new ReverseInteger.Solution();
        int input = 123;
        int expectedOutput = 321;
        int actualOutput = solution.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseNegativeNumber() {
        ReverseInteger.Solution solution = new ReverseInteger.Solution();
        int input = -123;
        int expectedOutput = -321;
        int actualOutput = solution.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseZero() {
        ReverseInteger.Solution solution = new ReverseInteger.Solution();
        int input = 0;
        int expectedOutput = 0;
        int actualOutput = solution.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseOverflow() {
        ReverseInteger.Solution solution = new ReverseInteger.Solution();
        int input = 1534236469;
        int expectedOutput = 0;
        int actualOutput = solution.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }
}




