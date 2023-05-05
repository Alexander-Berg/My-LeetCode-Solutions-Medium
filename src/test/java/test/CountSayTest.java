package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* CountSay Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/





public class CountSayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testCountAndSayBaseCase() {
        CountSay.Solution solution = new CountSay.Solution();
        String result = solution.countAndSay(1);
        assertEquals("1", result);
    }

    @Test
    public void testCountAndSayCase2() {
        CountSay.Solution solution = new CountSay.Solution();
        String result = solution.countAndSay(2);
        assertEquals("11", result);
    }

    @Test
    public void testCountAndSayCase3() {
        CountSay.Solution solution = new CountSay.Solution();
        String result = solution.countAndSay(3);
        assertEquals("21", result);
    }

    @Test
    public void testCountAndSayCase4() {
        CountSay.Solution solution = new CountSay.Solution();
        String result = solution.countAndSay(4);
        assertEquals("1211", result);
    }

    @Test
    public void testCountAndSayCase5() {
        CountSay.Solution solution = new CountSay.Solution();
        String result = solution.countAndSay(5);
        assertEquals("111221", result);
    }

    // add more test cases as needed...
}
