package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* CourseSchedule Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/ 

public class CourseScheduleTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testCanFinishTrue() {
        CourseSchedule.Solution solution = new CourseSchedule.Solution();
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        boolean result = solution.canFinish(4, prerequisites);
        assertTrue(result);
    }

    @Test
    public void testCanFinishFalse() {
        CourseSchedule.Solution solution = new CourseSchedule.Solution();
        int[][] prerequisites = {{1,0},{0,1}};
        boolean result = solution.canFinish(2, prerequisites);
        assertFalse(result);
    }

    @Test
    public void testCanFinishEmpty() {
        CourseSchedule.Solution solution = new CourseSchedule.Solution();
        int[][] prerequisites = {};
        boolean result = solution.canFinish(1, prerequisites);
        assertTrue(result);
    }
}
