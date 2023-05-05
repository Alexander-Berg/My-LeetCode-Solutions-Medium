package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
/** 
* LRUCacheA Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class LRUCacheATest {
    LRUCacheA.LRUCache cache;

    @Before
    public void setup() {

    }
    @After
    public void after() throws Exception {
    }


    @Test
    public void testCacheCapacity() {
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        assertEquals(cache.get(1), -1);
    }

    @Test
    public void testCacheAccessOrder() {
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(cache.get(1), 1);
        cache.put(3, 3);
        assertEquals(cache.get(2), -1);
        cache.put(4, 4);
        assertEquals(cache.get(1), -1);
        assertEquals(cache.get(3), 3);
        assertEquals(cache.get(4), 4);
    }

    @Test
    public void testCacheUpdate() {
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10);
        assertEquals(cache.get(1), 10);
    }

}
