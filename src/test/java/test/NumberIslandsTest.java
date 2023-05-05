package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* NumberIslands Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class NumberIslandsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testNumIslands() {
        NumberIslands.Solution solution = new NumberIslands.Solution();

        char[][] grid1 = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        assertEquals(1, solution.numIslands(grid1));
    }
        @Test
        public void testNumIslands2() {
            NumberIslands.Solution solution = new NumberIslands.Solution();
            char[][] grid2 = {{'1', '1', '0', '0', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '1', '0', '0'},
                    {'0', '0', '0', '1', '1'}};
            assertEquals(3, solution.numIslands(grid2));
        }
            @Test
            public void testNumIslands3() {
                NumberIslands.Solution solution = new NumberIslands.Solution();
        char[][] grid3 = {{'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}};
        assertEquals(0, solution.numIslands(grid3));
    }
}

