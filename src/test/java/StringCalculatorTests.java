import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTests {

    @Test
    public void TestAddEmptyStringIsZero() {
        StringCalculator sc = new StringCalculator();
        String numbers = "";

        int r = sc.Add(numbers);
        Assert.assertEquals(0, r);
    }

    @Test
    public void TestAddOneNumberString() {
        StringCalculator sc = new StringCalculator();
        String numbers = "1";

        int r = sc.Add(numbers);
        Assert.assertEquals(1, r);
    }

    @Test
    public void TestAddTwoNumberString() {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,2";

        int r = sc.Add(numbers);
        Assert.assertEquals(3, r);
    }


}
