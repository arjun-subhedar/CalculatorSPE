import org.example.Calculator;
import org.junit.Test;
import org.junit.Assert;
public class CalculatorTest {

    // Test for factorial of a positive number
    @Test
    public void testFactorialPositive() {
        int observed = Calculator.factorial(5);
        int expected = 120;
        Assert.assertEquals(expected, observed);
    }

    // Test for factorial of zero
    @Test
    public void testFactorialZero() {
        int observed = Calculator.factorial(0);
        int expected = 1;
        Assert.assertEquals(expected, observed);
    }

    // Test for factorial of a negative number
    @Test
    public void testFactorialNegative() {
        int observed = Calculator.factorial(-5);
        int expected = -1;
        Assert.assertEquals(expected, observed);
    }

    // Test for square root of a positive number
    @Test
    public void testSqrtPositive() {
        double observed = Calculator.sqrt(16);
        double expected = 4.0;
        Assert.assertEquals(expected, observed, 1e-10);
    }

    // Test for square root of zero
    @Test
    public void testSqrtZero() {
        double observed = Calculator.sqrt(0);
        double expected = 0.0;
        Assert.assertEquals(expected, observed, 1e-10);
    }

    // Test for square root of a negative number
    @Test
    public void testSqrtNegative() {
        double observed = Calculator.sqrt(-10);
        double expected = -1;
        Assert.assertEquals(expected, observed, 1e-10);
    }

    // Test for natural logarithm (log)
    @Test
    public void testNaturalLog() {
        double observed = Calculator.log(Math.E);
        double expected = 1.0;
        Assert.assertEquals(expected, observed, 1e-10);
    }

    // Test for power function
    @Test
    public void testPowerFunction() {
        double observed = Calculator.pow(2, 3);
        double expected = 8.0;
        Assert.assertEquals(expected, observed, 1e-10);
    }
}