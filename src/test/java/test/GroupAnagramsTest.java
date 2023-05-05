package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
/** 
* GroupAnagrams Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/


public class GroupAnagramsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGroupAnagrams() {
        GroupAnagrams.Solution solution = new GroupAnagrams.Solution();

        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected1 = List.of(
                List.of("eat", "tea", "ate"),
                List.of("tan", "nat"),
                List.of("bat")
        );
        List<List<String>> output1 = solution.groupAnagrams(input1);
        assertEquals(expected1, output1);
    }
        @Test
        public void testGroupAnagrams2() {
            GroupAnagrams.Solution solution = new GroupAnagrams.Solution();

            String[] input2 = {"hello", "world", "hi", "dellho", "rowld", "ih"};
            List<List<String>> expected2 = List.of(
                    List.of("hello", "dellho"),
                    List.of("world", "rowld"),
                    List.of("hi", "ih")
            );
            List<List<String>> output2 = solution.groupAnagrams(input2);
            assertEquals(expected2, output2);
        }
            @Test
            public void testGroupAnagrams3() {
                GroupAnagrams.Solution solution = new GroupAnagrams.Solution();

        String[] input3 = {"aab", "baa", "aba", "cde", "dec"};
        List<List<String>> expected3 = List.of(
                List.of("aab", "baa", "aba"),
                List.of("cde", "dec")
        );
        List<List<String>> output3 = solution.groupAnagrams(input3);
        assertEquals(expected3, output3);
    }
}
