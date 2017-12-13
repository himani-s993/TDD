import org.junit.Assert;
import org.junit.Test;

public class StringHelperTest {

    @Test
    public void strWith2CharIsReversedTest() {
        StringHelper stringHelper = new StringHelper();
        Assert.assertEquals("BA", stringHelper.swapLast2Char("AB"));
    }
}
