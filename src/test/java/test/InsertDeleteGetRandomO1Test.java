package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* InsertDeleteGetRandomO1 Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class InsertDeleteGetRandomO1Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
        public void testInsert() {
            InsertDeleteGetRandomO1.RandomizedSet set = new InsertDeleteGetRandomO1.RandomizedSet();
            assertTrue(set.insert(1));
            assertTrue(set.insert(2));
            assertFalse(set.insert(1));
            assertTrue(set.insert(3));
        }

        @Test
        public void testRemove() {
            InsertDeleteGetRandomO1.RandomizedSet set = new InsertDeleteGetRandomO1.RandomizedSet();
            set.insert(1);
            set.insert(2);
            assertTrue(set.remove(1));
            assertFalse(set.remove(3));
            assertTrue(set.remove(2));
        }

        @Test
        public void testGetRandom() {
            InsertDeleteGetRandomO1.RandomizedSet set = new InsertDeleteGetRandomO1.RandomizedSet();
            set.insert(1);
            set.insert(2);
            set.insert(3);
            int random = set.getRandom();
            assertTrue(random == 1 || random == 2 || random == 3);
        }

    }





