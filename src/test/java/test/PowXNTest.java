package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
/** 
* PowXN Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class PowXNTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testMyPow() {
        PowXN.Solution solution = new PowXN.Solution();

        double x1 = 2.0;
        int n1 = 10;
        double expected1 = 1024.0;
        double actual1 = solution.myPow(x1, n1);
        assertEquals(expected1, actual1, 0.00001);

        double x2 = 2.0;
        int n2 = -2;
        double expected2 = 0.25;
        double actual2 = solution.myPow(x2, n2);
        assertEquals(expected2, actual2, 0.00001);

        double x3 = 0.0;
        int n3 = 10;
        double expected3 = 0.0;
        double actual3 = solution.myPow(x3, n3);
        assertEquals(expected3, actual3, 0.00001);

        double x4 = 10.0;
        int n4 = 10000;
        double expected4 = 0.0;
        double actual4 = solution.myPow(x4, n4);
        assertEquals(expected4, actual4, 0.00001);
    }
}
