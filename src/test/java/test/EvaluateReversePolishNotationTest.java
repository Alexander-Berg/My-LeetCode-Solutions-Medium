package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* EvaluateReversePolishNotation Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/



public class EvaluateReversePolishNotationTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testEvalRPN() {
        EvaluateReversePolishNotation.Solution sol = new EvaluateReversePolishNotation.Solution();

        String[] input1 = {"2", "1", "+", "3", "*"};
        int output1 = 9;
        assertEquals(output1, sol.evalRPN(input1));
    }
        @Test
        public void testEvalRPN2() {
            EvaluateReversePolishNotation.Solution sol = new EvaluateReversePolishNotation.Solution();
            String[] input2 = {"4", "13", "5", "/", "+"};
            int output2 = 6;
            assertEquals(output2, sol.evalRPN(input2));
        }
            @Test
            public void testEvalRPN3() {
                EvaluateReversePolishNotation.Solution sol = new EvaluateReversePolishNotation.Solution();
                String[] input3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
                int output3 = 22;
                assertEquals(output3, sol.evalRPN(input3));
            }
                @Test
                public void testEvalRPN4() {
                    EvaluateReversePolishNotation.Solution sol = new EvaluateReversePolishNotation.Solution();
                    String[] input4 = {"2", "1", "-", "3", "*"};
                    int output4 = 3;
                    assertEquals(output4, sol.evalRPN(input4));
                }
                    @Test
                    public void testEvalRPN5() {
                        EvaluateReversePolishNotation.Solution sol = new EvaluateReversePolishNotation.Solution();
        String[] input5 = {"2", "1", "+", "3", "4", "*", "-"};
        int output5 = -9;
        assertEquals(output5, sol.evalRPN(input5));
    }}

