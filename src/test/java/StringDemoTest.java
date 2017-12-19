import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testSwapLastTwoCharsType1() {
        StringDemo stringDemo = new StringDemo();

//        Assert.assertArrayEquals("AB", stringDemo.swapLastTwoChars("BA"));
        Assert.assertEquals("A", stringDemo.swapLastTwoChars("A"));
    }

    @Test
    public void testSwapLastTwoCharsType2() {
        StringDemo stringDemo = new StringDemo();

        Assert.assertEquals("ABC", stringDemo.swapLastTwoChars("ACB"));
    }
}
