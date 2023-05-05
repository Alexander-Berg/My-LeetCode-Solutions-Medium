package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
* BasicCalculator Tester. 
* 
* @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/ 

public class BasicCalculatorTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testCalculate()  throws Exception {
        BasicCalculator.Solution solution = new BasicCalculator.Solution();

        String s1 = "1 + 2 + 3 + 4 + 5";
        int expected1 = 15;
        assertEquals(expected1, solution.calculate(s1));
    }
        @Test
        public void testCalculate2()  throws Exception {
            BasicCalculator.Solution solution = new BasicCalculator.Solution();
            String s2 = "3 * 5 - 7 / 2";
            int expected2 = 14;
            assertEquals(expected2, solution.calculate(s2));
        }
            @Test
            public void testCalculate3()  throws Exception {
                BasicCalculator.Solution solution = new BasicCalculator.Solution();
                String s3 = "1 + 2 * 3 - 4 / 5";
                int expected3 = 7;
                assertEquals(expected3, solution.calculate(s3));
            }
                @Test
                public void testCalculate4()  throws Exception {
                    BasicCalculator.Solution solution = new BasicCalculator.Solution();
        String s4 = "5 - 3 / 4 * 2";
        int expected4 = 4;
        assertEquals(expected4, solution.calculate(s4));
    }
}
