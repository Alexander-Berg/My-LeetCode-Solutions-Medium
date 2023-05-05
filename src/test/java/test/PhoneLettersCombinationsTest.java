package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import java.util.List;
import static org.junit.Assert.assertEquals;

/** 
* PhoneLettersCombinations Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0
 */

    public class PhoneLettersCombinationsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
        @Test
        public void testLetterCombinationsWithEmptyInput() {
            PhoneLettersCombinations.Solution solution = new PhoneLettersCombinations.Solution();
            List<String> result = solution.letterCombinations("");
            assertEquals(List.of(), result);
        }

        @Test
        public void testLetterCombinationsWithSingleDigit() {
            PhoneLettersCombinations.Solution solution = new PhoneLettersCombinations.Solution();
            List<String> result = solution.letterCombinations("2");
            assertEquals(List.of("a", "b", "c"), result);
        }

        @Test
        public void testLetterCombinationsWithMultipleDigits() {
            PhoneLettersCombinations.Solution solution = new PhoneLettersCombinations.Solution();
            List<String> result = solution.letterCombinations("23");
            assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
        }

        @Test
        public void testLetterCombinationsWithNonNumericInput() {
            PhoneLettersCombinations.Solution solution = new PhoneLettersCombinations.Solution();
            List<String> result = solution.letterCombinations("abc");
            assertEquals(List.of(), result);
        }
    }



