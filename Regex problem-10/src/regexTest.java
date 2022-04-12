import org.junit.Assert;
import org.junit.Test;

public class regexTest {
    regexMain reg = new regexMain();

    @Test
    public void givenFirstNameContainsaCapitalLetter() {
        boolean result = reg.firstName("Kunal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameContainsaCapitalLetter() {
        boolean result = reg.firstName("Batam");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailIsFormatted() {
        boolean result = reg.email("abc.xyx@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordContainsoneFirstLetterOneLastLetterOneSpecialCharacter() {
        boolean result = reg.password("Kunal123@");
        Assert.assertTrue(result);
    }
}