package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**


 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0
 */

public class CoinChangeTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testCoinChange1()  {
        CoinChange.Solution sol = new CoinChange.Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;
        int result = sol.coinChange(coins, amount);
        assertEquals(expected, result);
    }

    @Test
    public void testCoinChange2()   {
        CoinChange.Solution sol = new CoinChange.Solution();
        int[] coins = {2};
        int amount = 3;
        int expected = -1;
        int result = sol.coinChange(coins, amount);
        assertEquals(expected, result);
    }

    @Test
    public void testCoinChange3()   {
        CoinChange.Solution sol = new CoinChange.Solution();
        int[] coins = {1, 3, 5};
        int amount = 8;
        int expected = 2;
        int result = sol.coinChange(coins, amount);
        assertEquals(expected, result);
    }
}
