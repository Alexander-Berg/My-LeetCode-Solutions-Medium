package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;
/** 
* FractionReccuringDecimal Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class FractionReccuringDecimalTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testFractionToDecimal() {
        FractionReccuringDecimal.Solution solution = new FractionReccuringDecimal.Solution();

        // Test positive fraction
        int n = 2;
        int d = 3;
        String expectedOutput = "0.(6)";
        String actualOutput = solution.fractionToDecimal(n, d);
        assertEquals(expectedOutput, actualOutput);
    }
        @Test
        public void testFractionToDecimal2() {
            FractionReccuringDecimal.Solution solution = new FractionReccuringDecimal.Solution();
            // Test negative fraction
            int n = -1;
            int d = 3;
            String expectedOutput = "-0.(3)";
            String actualOutput = solution.fractionToDecimal(n, d);
            assertEquals(expectedOutput, actualOutput);
        }
            @Test
            public void testFractionToDecimal3() {
                FractionReccuringDecimal.Solution solution = new FractionReccuringDecimal.Solution();
                // Test non-recurring fraction
                int n = 4;
                int d = 5;
                String expectedOutput = "0.8";
                String actualOutput = solution.fractionToDecimal(n, d);
                assertEquals(expectedOutput, actualOutput);
            }
                @Test
                public void testFractionToDecimal4() {
                    FractionReccuringDecimal.Solution solution = new FractionReccuringDecimal.Solution();
                    // Test fraction with 0 in numerator
                    int n = 0;
                    int d = 3;
                    String expectedOutput = "0";
                    String actualOutput = solution.fractionToDecimal(n, d);
                    assertEquals(expectedOutput, actualOutput);
                }
    @Test
    public void testFractionToDecimal5() {
        FractionReccuringDecimal.Solution solution = new FractionReccuringDecimal.Solution();
        // Test fraction with 0 in denominator
        int n = 2;
        int d = 0;
        String expectedOutput = "";
        String actualOutput = solution.fractionToDecimal(n, d);
        assertEquals(expectedOutput, actualOutput);
    }
}

