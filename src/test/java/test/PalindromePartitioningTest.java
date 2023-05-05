package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;
/** 
* PalindromePartitioning Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4 2023</pre>
* @version 1.0 
*/


public class PalindromePartitioningTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testPalindromePartitioning() {
        PalindromePartitioning.Solution pp = new PalindromePartitioning.Solution();
        List<List<String>> result = pp.partition("aab");
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("a", "a", "b")));
        assertTrue(result.contains(List.of("aa", "b")));
    }

    @Test
    public void testPalindromePartitioningEmptyString() {
        PalindromePartitioning.Solution pp = new PalindromePartitioning.Solution();
        List<List<String>> result = pp.partition("");
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of()));
    }

    @Test
    public void testPalindromePartitioningSingleCharacter() {
        PalindromePartitioning.Solution pp = new PalindromePartitioning.Solution();
        List<List<String>> result = pp.partition("a");
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of("a")));
    }

    @Test
    public void testPalindromePartitioningAllCharactersSame() {
        PalindromePartitioning.Solution pp = new PalindromePartitioning.Solution();
        List<List<String>> result = pp.partition("ccc");
        assertEquals(3, result.size());
        assertTrue(result.contains(List.of("c", "c", "c")));
        assertTrue(result.contains(List.of("cc", "c")));
        assertTrue(result.contains(List.of("c", "cc")));
    }
}
