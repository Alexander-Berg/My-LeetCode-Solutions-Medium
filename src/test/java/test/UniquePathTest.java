package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* UniquePath Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class UniquePathTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testUniquePaths() {
        UniquePath.Solution sol = new UniquePath.Solution();

        // Test case 1: m = 3, n = 2
        int m1 = 3, n1 = 2;
        int expected1 = 3;
        int result1 = sol.uniquePaths(m1, n1);
        assertEquals(expected1, result1);

        // Test case 2: m = 7, n = 3
        int m2 = 7, n2 = 3;
        int expected2 = 28;
        int result2 = sol.uniquePaths(m2, n2);
        assertEquals(expected2, result2);

        // Test case 3: m = 1, n = 1
        int m3 = 1, n3 = 1;
        int expected3 = 1;
        int result3 = sol.uniquePaths(m3, n3);
        assertEquals(expected3, result3);
    }
}

