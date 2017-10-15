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
    @Test
    public void TestAdd10NumberString() {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,22,32,23,342,3242,32425,5234,829,1233";

        int r = sc.Add(numbers);
        Assert.assertEquals(43383, r);
    }


}
