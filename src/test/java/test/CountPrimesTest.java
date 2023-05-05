package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author <Alexander Berg>
 * @since <pre>May 3, 2023</pre>
 * @version 1.0


public class CountPrimesTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testCountPrimesWithZero() {
        CountPrimes cp = new CountPrimes();
        assertEquals(0, cp.countPrimes(0));
    }

    @Test
    public void testCountPrimesWithOne() {
        CountPrimes cp = new CountPrimes();
        assertEquals(0, cp.countPrimes(1));
    }

    @Test
    public void testCountPrimesWithTwo() {
        CountPrimes cp = new CountPrimes();
        assertEquals(0, cp.countPrimes(2));
    }

    @Test
    public void testCountPrimesWithTen() {
        CountPrimes cp = new CountPrimes();
        assertEquals(4, cp.countPrimes(10));
    }

    @Test
    public void testCountPrimesWithOneHundred() {
        CountPrimes cp = new CountPrimes();
        assertEquals(25, cp.countPrimes(100));
    }

    @Test
    public void testCountPrimesWithOneThousand() {
        CountPrimes cp = new CountPrimes();
        assertEquals(168, cp.countPrimes(1000));
    }
}

*/
