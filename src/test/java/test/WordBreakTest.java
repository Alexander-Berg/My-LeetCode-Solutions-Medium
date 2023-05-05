package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
/** 
* WordBreak Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class WordBreakTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testWordBreak() {
        WordBreak.Solution solution = new WordBreak.Solution();

        String s1 = "leetcode";
        List<String> dict1 = Arrays.asList("leet", "code");
        assertTrue(solution.wordBreak(s1, dict1));
    }
        @Test
        public void testWordBreak2() {
            WordBreak.Solution solution = new WordBreak.Solution();
            String s2 = "applepenapple";
            List<String> dict2 = Arrays.asList("apple", "pen");
            assertTrue(solution.wordBreak(s2, dict2));
        }
            @Test
            public void testWordBreak3() {
                WordBreak.Solution solution = new WordBreak.Solution();
        String s3 = "catsandog";
        List<String> dict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(solution.wordBreak(s3, dict3));
    }
}

