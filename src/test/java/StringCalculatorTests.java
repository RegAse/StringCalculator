import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTests {

    @Test
    public void TestAddEmptyStringIsZero() throws Exception {
        StringCalculator sc = new StringCalculator();
        String numbers = "";

        int r = sc.Add(numbers);
        Assert.assertEquals(0, r);
    }

    @Test
    public void TestAddOneNumberString() throws Exception {
        StringCalculator sc = new StringCalculator();
        String numbers = "1";

        int r = sc.Add(numbers);
        Assert.assertEquals(1, r);
    }

    @Test
    public void TestAddTwoNumberString() throws Exception  {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,2";

        int r = sc.Add(numbers);
        Assert.assertEquals(3, r);
    }

    @Test
    public void TestAdd10NumberString() throws Exception  {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,22,32,23,342,3242,32425,5234,829,1233";

        int r = sc.Add(numbers);
        Assert.assertEquals(1249, r);
    }

    @Test
    public void TestAddWithNewlineAsDelimiterString() throws Exception  {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,22\n32,23,342,3242\n32425,5234\n829,1233";

        int r = sc.Add(numbers);
        Assert.assertEquals(1249, r);
    }

    @Test(expected = Exception.class)
    public void TestAddWithNegativeNumbersString() throws Exception  {
        StringCalculator sc = new StringCalculator();
        String numbers = "1,22\n32,-23,-342,3242\n32425,5234\n-829,1233";

        int r = sc.Add(numbers);
    }

    @Test
    public void TestAddWithSemicolonAsDelimiterString() throws Exception  {
        StringCalculator sc = new StringCalculator();
        String numbers = "//;\\1;22;32;23;342;3242;32425;5234;829;1233";

        int r = sc.Add(numbers);
        Assert.assertEquals(1249, r);
    }

}
