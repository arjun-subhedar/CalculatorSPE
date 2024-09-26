
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        double result = Main.SquareRoot(16);
        Assert.assertEquals(4.0, result, 0.0001);

        result = Main.SquareRoot(0);
        Assert.assertEquals(0.0, result, 0.0001);

        result = Main.SquareRoot(25);
        Assert.assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testFactorial() {
        int result = Main.Factorial(5);
        Assert.assertEquals(120, result);

        result = Main.Factorial(0);
        Assert.assertEquals(1, result);

        result = Main.Factorial(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testNaturalLog() {
        double result = Main.NaturalLog(Math.E);
        Assert.assertEquals(1.0, result, 0.0001);

        result = Main.NaturalLog(1);
        Assert.assertEquals(0.0, result, 0.0001);

        Assert.assertThrows(IllegalArgumentException.class, () -> Main.NaturalLog(-5));
    }

    @Test
    public void testPower() {
        double result = Main.Power(2, 3);
        Assert.assertEquals(8.0, result, 0.0001);

        result = Main.Power(5, 0);
        Assert.assertEquals(1.0, result, 0.0001);

        result = Main.Power(0, 5);
        Assert.assertEquals(0.0, result, 0.0001);

        result = Main.Power(0, 0);  // Mathematical edge case
        Assert.assertEquals(1.0, result, 0.0001);
    }
}

