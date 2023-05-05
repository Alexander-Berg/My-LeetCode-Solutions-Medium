package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* LongestSubstringAtLeastKRepeatingCharacters Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class LongestSubstringAtLeastKRepeatingCharactersTest {


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testEmptyString() {
        LongestSubstringAtLeastKRepeatingCharacters.Solution solution = new LongestSubstringAtLeastKRepeatingCharacters.Solution();
        int result = solution.longestSubstring("", 1);
        assertEquals(0, result);
    }

    @Test
    public void testAllCharactersAppearAtLeastKTimes() {
        LongestSubstringAtLeastKRepeatingCharacters.Solution solution = new LongestSubstringAtLeastKRepeatingCharacters.Solution();
        int result = solution.longestSubstring("aaabb", 2);
        assertEquals(5, result);
    }

    @Test
    public void testNoCharactersAppearAtLeastKTimes() {
        LongestSubstringAtLeastKRepeatingCharacters.Solution solution = new LongestSubstringAtLeastKRepeatingCharacters.Solution();
        int result = solution.longestSubstring("abcde", 3);
        assertEquals(0, result);
    }

    @Test
    public void testMixedCharactersAppearAtLeastKTimes() {
        LongestSubstringAtLeastKRepeatingCharacters.Solution solution = new LongestSubstringAtLeastKRepeatingCharacters.Solution();
        int result = solution.longestSubstring("aaabbcccdddd", 3);
        assertEquals(10, result);
    }
}

