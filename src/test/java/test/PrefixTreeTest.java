package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* PrefixTree Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 4, 2023</pre>
* @version 1.0 
*/

public class PrefixTreeTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testInsertAndSearch() {
        PrefixTree.Trie trie = new PrefixTree.Trie();
        trie.insert("hello");
        trie.insert("world");

        assertTrue(trie.search("hello"));
        assertTrue(trie.search("world"));
        assertFalse(trie.search("foobar"));
    }

    @Test
    public void testStartsWith() {
        PrefixTree.Trie trie = new PrefixTree.Trie();
        trie.insert("hello");
        trie.insert("world");

        assertTrue(trie.startsWith("he"));
        assertTrue(trie.startsWith("wor"));
        assertFalse(trie.startsWith("fo"));
    }
}
