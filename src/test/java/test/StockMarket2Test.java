package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* StockMarket2 Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class StockMarket2Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMaxProfit() {
        StockMarket2.Solution sol = new StockMarket2.Solution();

        int[] prices1 = {7,1,5,3,6,4};
        assertEquals(7, sol.maxProfit(prices1));

        int[] prices2 = {1,2,3,4,5};
        assertEquals(4, sol.maxProfit(prices2));

        int[] prices3 = {7,6,4,3,1};
        assertEquals(0, sol.maxProfit(prices3));

        int[] prices4 = {2,4,1};
        assertEquals(2, sol.maxProfit(prices4));
    }

}

