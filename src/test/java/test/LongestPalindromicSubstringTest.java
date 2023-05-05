package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
/** 
* LongestPalindromicSubstring Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class LongestPalindromicSubstringTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLongestPalindrome1() {
        LongestPalindromicSubstring.Solution lps = new LongestPalindromicSubstring.Solution();
        String result = lps.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    public void testLongestPalindrome2() {
        LongestPalindromicSubstring.Solution lps = new LongestPalindromicSubstring.Solution();
        String result = lps.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    public void testLongestPalindrome3() {
        LongestPalindromicSubstring.Solution lps = new LongestPalindromicSubstring.Solution();
        String result = lps.longestPalindrome("a");
        assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome4() {
        LongestPalindromicSubstring.Solution lps = new LongestPalindromicSubstring.Solution();
        String result = lps.longestPalindrome("ac");
        assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome5() {
        LongestPalindromicSubstring.Solution lps = new LongestPalindromicSubstring.Solution();
        String result = lps.longestPalindrome("aaaa");
        assertEquals("aaaa", result);
    }
}

