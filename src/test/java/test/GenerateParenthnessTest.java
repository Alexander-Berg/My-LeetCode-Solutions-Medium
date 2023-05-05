package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;
import java.util.List;
/** 
* GenerateParenthness Tester. 
*
 * @author <Alexander Berg>
* @since <pre>May 3, 2023</pre> 
* @version 1.0 
*/

public class GenerateParenthnessTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testGenerateParenthesisWithNEqualOne() {
        GenerateParenthness.Solution solution = new GenerateParenthness.Solution();
        List<String> result = solution.generateParenthesis(1);

        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("()"));
    }

    @Test
    public void testGenerateParenthesisWithNEqualTwo() {
        GenerateParenthness.Solution solution = new GenerateParenthness.Solution();
        List<String> result = solution.generateParenthesis(2);

        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("()()"));
        Assert.assertTrue(result.contains("(())"));
    }

    @Test
    public void testGenerateParenthesisWithNEqualThree() {
        GenerateParenthness.Solution solution = new GenerateParenthness.Solution();
        List<String> result = solution.generateParenthesis(3);

        Assert.assertEquals(5, result.size());
        Assert.assertTrue(result.contains("()()()"));
        Assert.assertTrue(result.contains("()(())"));
        Assert.assertTrue(result.contains("(())()"));
        Assert.assertTrue(result.contains("(()())"));
        Assert.assertTrue(result.contains("((()))"));
    }
}
