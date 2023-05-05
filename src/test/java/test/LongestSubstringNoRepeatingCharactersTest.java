package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* LongestSubstringNoRepeatingCharacters Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class LongestSubstringNoRepeatingCharactersTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLengthOfLongestSubstring_EmptyString() {
        LongestSubstringNoRepeatingCharacters.Solution sol = new LongestSubstringNoRepeatingCharacters.Solution();
        int result = sol.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    public void testLengthOfLongestSubstring_SingleChar() {
        LongestSubstringNoRepeatingCharacters.Solution sol = new LongestSubstringNoRepeatingCharacters.Solution();
        int result = sol.lengthOfLongestSubstring("a");
        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubstring_AllRepeatingChars() {
        LongestSubstringNoRepeatingCharacters.Solution sol = new LongestSubstringNoRepeatingCharacters.Solution();
        int result = sol.lengthOfLongestSubstring("aaaaa");
        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubstring_NoRepeatingChars() {
        LongestSubstringNoRepeatingCharacters.Solution sol = new LongestSubstringNoRepeatingCharacters.Solution();
        int result = sol.lengthOfLongestSubstring("abcdef");
        assertEquals(6, result);
    }

    @Test
    public void testLengthOfLongestSubstring_WithRepeatingChars() {
        LongestSubstringNoRepeatingCharacters.Solution sol = new LongestSubstringNoRepeatingCharacters.Solution();
        int result = sol.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }
}

