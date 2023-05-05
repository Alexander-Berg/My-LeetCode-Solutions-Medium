package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;

/** 
* GameofLife Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 


public class GameOfLifeTest<GameOfLife> {


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGameOfLife() {
        GameOfLife game = new GameOfLife();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        game.solution().gameOfLife(board);
        int[][] expected = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        Assert.assertArrayEquals(expected, board);
    }

    @Test
    public void testNeighbor() {
        GameOfLife game = new GameOfLife();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        Assert.assertEquals(1, game.solution().neighbor(board, 0, 1));
        Assert.assertEquals(0, game.solution().neighbor(board, 0, 0));
        Assert.assertEquals(0, game.solution().neighbor(board, 3, 0));
        Assert.assertEquals(0, game.solution().neighbor(board, 2, 2));
        Assert.assertEquals(0, game.solution().neighbor(board, 1, 2));
    }
}

 */
