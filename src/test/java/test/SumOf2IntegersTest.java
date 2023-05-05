package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;

/** 
* SumOf2Integers Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/


public class SumOf2IntegersTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetSum() {
        SumOf2Integers.Solution sum = new SumOf2Integers.Solution();
        SumOf2Integers.Solution sol = new SumOf2Integers.Solution();

        assertEquals(2, sol.getSum(1, 1));
        assertEquals(15, sol.getSum(7, 8));
        assertEquals(-1, sol.getSum(0, -1));
        assertEquals(0, sol.getSum(0, 0));
        assertEquals(2147483646, sol.getSum(1073741823, 1073741823));
        assertEquals(-2147483648, sol.getSum(-1073741824, -1073741824));
    }
}
