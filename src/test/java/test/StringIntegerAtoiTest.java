package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* StringIntegerAtoi Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 



    public class StringIntegerAtoiTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    StringIntegerAtoi.myAtoi  N7 = new StringIntegerAtoi.myAtoi ();

        @Test
        public void testPositiveNumber() {
            assertEquals(42, stringIntegerAtoi.myAtoi("42"));
        }

        @Test
        public void testNegativeNumber() {
            assertEquals(-42, stringIntegerAtoi.myAtoi("-42"));
        }

        @Test
        public void testNumberWithLeadingSpaces() {
            assertEquals(4193, stringIntegerAtoi.myAtoi("    4193"));
        }

        @Test
        public void testNumberWithTrailingSpaces() {
            assertEquals(0, stringIntegerAtoi.myAtoi("4193    "));
        }

        @Test
        public void testNumberWithLeadingAndTrailingSpaces() {
            assertEquals(-2147483648, stringIntegerAtoi.myAtoi("   -91283472332   "));
        }

        @Test
        public void testNonNumericCharacters() {
            assertEquals(0, stringIntegerAtoi.myAtoi("words and 987"));
        }

        @Test
        public void testNumberGreaterThanMaxValue() {
            assertEquals(Integer.MAX_VALUE, stringIntegerAtoi.myAtoi("91283472332"));
        }

        @Test
        public void testNumberLessThanMinValue() {
            assertEquals(Integer.MIN_VALUE, stringIntegerAtoi.myAtoi("-91283472332"));
        }
    }

}

 */
