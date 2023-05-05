package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* IncreasingTripletSubsequence Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class IncreasingTripletSubsequenceTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testIncreasingTriplet() {
        IncreasingTripletSubsequence.Solution solution = new IncreasingTripletSubsequence.Solution();

        int[] arr1 = {1, 2, 3, 4, 5};
        assertTrue(solution.increasingTriplet(arr1));
    }
        @Test
        public void testIncreasingTriplet2() {
            IncreasingTripletSubsequence.Solution solution = new IncreasingTripletSubsequence.Solution();

            int[] arr2 = {5, 4, 3, 2, 1};
            assertFalse(solution.increasingTriplet(arr2));
        }
            @Test
            public void testIncreasingTriplet3() {
                IncreasingTripletSubsequence.Solution solution = new IncreasingTripletSubsequence.Solution();

                int[] arr3 = {1, 2, 1, 2, 1, 2, 1};
                assertFalse(solution.increasingTriplet(arr3));
            }
                @Test
                public void testIncreasingTriplet4() {
                    IncreasingTripletSubsequence.Solution solution = new IncreasingTripletSubsequence.Solution();

        int[] arr4 = {1, 2, 3, 1, 2, 3};
        assertTrue(solution.increasingTriplet(arr4));
    }
}

