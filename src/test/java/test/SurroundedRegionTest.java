package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* SurroundedRegion Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/
public class SurroundedRegionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testSolve() {
        char[][] grid1 = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected1 = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new SurroundedRegion.Solution().solve(grid1);
        assertArrayEquals(expected1, grid1);

        char[][] grid2 = {
                {'O', 'O'},
                {'O', 'O'}
        };
        char[][] expected2 = {
                {'O', 'O'},
                {'O', 'O'}
        };
        new SurroundedRegion.Solution().solve(grid2);
        assertArrayEquals(expected2, grid2);

        char[][] grid3 = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        char[][] expected3 = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        new SurroundedRegion.Solution().solve(grid3);
        assertArrayEquals(expected3, grid3);
    }
}

