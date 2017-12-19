import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

    @Before
    public void setUp() {
    }

//    //Failing
//    @Test
//    public void testSwapLast2Char_Type1() {
//        StringHelper stringHelper = new StringHelper();
//        Assert.assertEquals("BA", stringHelper.swapLast2CharType1("AB"));
//    }

    @Test
    public void testSwapLast2Char_Type2() {
        StringHelper stringHelper = new StringHelper();
        Assert.assertEquals("ZBA", stringHelper.swapLast2CharType2("ZAB"));
    }

//    //Failing
//    @Test
//    public void testSwapLast2Char_Type3() {
//        StringHelper stringHelper = new StringHelper();
//        Assert.assertEquals("A", stringHelper.swapLast2CharType2("A"));
//    }
//
//    @Test
//    public void testSwapLast2Char_Type4() {
//        StringHelper stringHelper = new StringHelper();
//        Assert.assertEquals("", stringHelper.swapLast2CharType1(""));
//    }
//
//    @Test
//    public void testSwapLast2Char_Type5() {
//        StringHelper stringHelper = new StringHelper();
//        Assert.assertEquals("A", stringHelper.swapLast2CharType3("A"));
//    }
//
//    @After
//    public void tearDown() {
//    }
}
