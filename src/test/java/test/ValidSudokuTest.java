package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* ValidSudoku Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/


public class ValidSudokuTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testValidSudoku() {
        ValidSudoku.Solution solution = new ValidSudoku.Solution();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    public void testInvalidSudoku() {
        ValidSudoku.Solution solution = new ValidSudoku.Solution();
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertFalse(solution.isValidSudoku(board));
    }

    @Test
    public void testEmptySudoku() {
        ValidSudoku.Solution solution = new ValidSudoku.Solution();
        char[][] board = new char[9][9];
        assertTrue(solution.isValidSudoku(board));
    }

}
