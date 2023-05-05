package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* MergeIntervals Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class MergeIntervalsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void test1() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        int[][] result = new MergeIntervals.Solution().merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[][] intervals = {{1,4},{4,5}};
        int[][] expected = {{1,5}};
        int[][] result = new MergeIntervals.Solution().merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[][] intervals = {{1,4},{2,3}};
        int[][] expected = {{1,4}};
        int[][] result = new MergeIntervals.Solution().merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test4() {
        int[][] intervals = {{1,4},{0,0}};
        int[][] expected = {{0,0},{1,4}};
        int[][] result = new MergeIntervals.Solution().merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test5() {
        int[][] intervals = {{1,4},{5,6}};
        int[][] expected = {{1,4},{5,6}};
        int[][] result = new MergeIntervals.Solution().merge(intervals);
        assertArrayEquals(expected, result);
    }
}
