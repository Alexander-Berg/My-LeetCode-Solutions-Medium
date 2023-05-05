package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* MinStack Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 



public class MinStackTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

        @Test
        public void testPushPop() {
            MinStack.stack  = new MinStack();
            stack.push(5);
            stack.push(2);
            assertEquals(2, stack.top());
            stack.pop();
            assertEquals(5, stack.top());
            stack.pop();
            assertTrue(stack.isEmpty());
        }

        @Test
        public void testMin() {
            MinStack stack = new MinStack();
            stack.push(5);
            stack.push(2);
            stack.push(3);
            stack.push(1);
            assertEquals(1, stack.getMin());
            stack.pop();
            assertEquals(2, stack.getMin());
            stack.pop();
            assertEquals(2, stack.getMin());
            stack.pop();
            assertEquals(5, stack.getMin());
        }

        @Test
        public void testEmptyStack() {
            MinStack stack = new MinStack();
            assertTrue(stack.isEmpty());
            stack.push(1);
            assertFalse(stack.isEmpty());
            stack.pop();
            assertTrue(stack.isEmpty());
        }
    }

*/