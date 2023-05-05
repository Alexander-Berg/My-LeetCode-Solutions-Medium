package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* WordSearch Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class WordSearchTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testExistReturnsTrue() {
        WordSearch.Solution solution = new WordSearch.Solution();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        assertTrue(solution.exist(board, word));
    }

    @Test
    public void testExistReturnsFalse() {
        WordSearch.Solution solution = new WordSearch.Solution();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCB";
        assertFalse(solution.exist(board, word));
    }

    @Test
    public void testExistWithEmptyWordReturnsTrue() {
        WordSearch.Solution solution = new WordSearch.Solution();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "";
        assertTrue(solution.exist(board, word));
    }

    @Test
    public void testExistWithEmptyBoardReturnsFalse() {
        WordSearch.Solution solution = new WordSearch.Solution();
        char[][] board = {};
        String word = "ABCB";
        assertFalse(solution.exist(board, word));
    }
}
