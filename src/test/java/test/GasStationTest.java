package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* GasStation Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class GasStationTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testCanCompleteCircuit1() {
        GasStation.Solution sol = new GasStation.Solution();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        int result = sol.canCompleteCircuit(gas, cost);
        assertEquals(expected, result);
    }

    @Test
    public void testCanCompleteCircuit2() {
        GasStation.Solution sol = new GasStation.Solution();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int expected = -1;
        int result = sol.canCompleteCircuit(gas, cost);
        assertEquals(expected, result);
    }

    @Test
    public void testCanCompleteCircuit3() {
        GasStation.Solution sol = new GasStation.Solution();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {1, 2, 3, 4, 5};
        int expected = 0;
        int result = sol.canCompleteCircuit(gas, cost);
        assertEquals(expected, result);
    }
}
